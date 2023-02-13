package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Removee")
public class Removee extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
	
		String mail=req.getParameter("dmail");
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String del ="delete from ismart.eemp where email=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(del);
			ps.setString(1,mail);
			int d= ps.executeUpdate();
			PrintWriter pw = resp.getWriter();
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
