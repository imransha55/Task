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
@WebServlet("/Updationn")
public class Updationn extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String oldmail=req.getParameter("omail");
		String mail=req.getParameter("nmail");
		String tempsal=req.getParameter("nsal");
		int sal = Integer.parseInt(tempsal); 
		String num= req.getParameter("nnum");
		String url ="jdbc:mysql://localhost:3306?user=root&password=12345";
		String update= "update ismart.eEmp set email=? , esal=? , enum=? where email=?";
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
			PrintWriter pw = resp.getWriter();
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
