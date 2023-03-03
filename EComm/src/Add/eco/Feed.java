package Add.eco;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Feed")
public class Feed extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
	String delname=req.getParameter("dname");
	String delmail=req.getParameter("dmail");
	String cmt=req.getParameter("cfield");
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String insert="insert into ecom.feedback values(?,?,?) ";
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url);
		PreparedStatement ps =con.prepareStatement(insert);
		ps.setString(1, cmt);
		ps.setString(2, delmail);
		ps.setString(3, delname);
		int i = ps.executeUpdate();
		PrintWriter pw = resp.getWriter();
		if(i>0)
		{
			pw.println("Thanking You...!");
		}
	}
		
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}
}
