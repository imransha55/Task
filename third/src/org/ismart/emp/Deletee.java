package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Deletee")
public class Deletee extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws 
	ServletException, IOException {
	String mail=req.getParameter("dmail");
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String del ="delete from ismartdb.ismartorg where email=?";
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url);
		PreparedStatement ps = con.prepareStatement(del);
		ps.setString(1,mail);
		int d= ps.executeUpdate();
		PrintWriter pw = res.getWriter();
		if(d>0)
		{
			pw.println("Your Records Deleted from Our Org.");
			pw.println("Tc have a Bright feature");
		}
		
	} 
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

}
