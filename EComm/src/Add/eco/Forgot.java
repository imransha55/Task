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
@WebServlet("/Forgot")
public class Forgot extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String name=req.getParameter("un");
		String mob=req.getParameter("um");
		String mail=req.getParameter("uem");
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String sel="select * from ecom.aregistration where email=? and alogname=? and amobile=?";
		
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(url);
			PreparedStatement ps =con.prepareStatement(sel);
			ps.setString(2, name);
			ps.setString(3, mob);
			ps.setString(1, mail);
			ResultSet rs = ps.executeQuery();
			PrintWriter pw = resp.getWriter();
			if (rs.next()) 
			{
			int psw=rs.getInt(5);
			pw.println("User PAssword: "+psw);
				
			} 
			else
			{
				pw.println("Your an unauthorized Admin");
				pw.println();
				pw.println("Check The entered Details");
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	
	}

}
