package Add.eco;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteAdmin")
public class DeleteAdmin extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		String id=req.getParameter("n");
		String psw=req.getParameter("p");
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String del="delete from ecom.aregistration where (email=? or alogname=? or amobile=? ) and password=? ";
		try
		
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(del);
			ps.setString(1,id);
			ps.setString(2, id);
			ps.setString(3, id);
			ps.setString(4,psw);
			int i= ps.executeUpdate();
			PrintWriter pw = resp.getWriter();
			if(i>0)
			{
				resp.sendRedirect("feed.jsp");
			}
			else
			{
				pw.println("Your Are Not an Authorized admin");
			}
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
