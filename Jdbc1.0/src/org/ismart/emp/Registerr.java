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
@WebServlet("/Registerr")
public class Registerr extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String name=req.getParameter("ename");
		String tempid =req.getParameter("eid");
		int id = Integer.parseInt(tempid);
		String mail = req.getParameter("email");
		String num= req.getParameter("enum");
		String dob=req.getParameter("edob");
		String doj=req.getParameter("edoj");
		String  sal= req.getParameter("esal");
		String nat=req.getParameter("enative");
		String url ="jdbc:mysql://localhost:3306?user=root&password=12345";
		String insert= "insert into ismart.eEmp values(?,?,?,?,?,?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, name);
			ps.setInt(2,id);
			ps.setString(3,mail);
			ps.setString(4,num);
			ps.setString(5,dob); 
			ps.setString(6,doj);
			ps.setString(7,sal);
			ps.setString(8,nat);
		
			int s=ps.executeUpdate();
			PrintWriter pw = resp.getWriter();
			if(s>0)
			{
			pw.println("Welcome to Ismart");	
			pw.println("Registration completed...!");
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
