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
 @WebServlet("/Updatee")
public class Updatee extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{	
		
		String oldmail=req.getParameter("omail");
		String mail=req.getParameter("nmail");
		String tempsal=req.getParameter("nsal");
		int sal = Integer.parseInt(tempsal); 
		String num= req.getParameter("nnum");
		String url ="jdbc:mysql://localhost:3306?user=root&password=12345";
		String update= "update ismartdb.ismartorg set email=? , esal=? , enumber=? where email=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(4, oldmail);
			ps.setString(1,mail);
			ps.setInt(2, sal);
			ps.setString(3, num);
			int s= ps.executeUpdate();
			PrintWriter pw = res.getWriter();
			if(s>0)
			{
				pw.println("Your Records UPDATED");
			}
			else
			{
				pw.println("Invalid Old Main...!");
			}
		
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
