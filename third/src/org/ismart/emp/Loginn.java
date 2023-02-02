package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mysql.fabric.xmlrpc.base.Data;

 @WebServlet("/Loginn")
public class Loginn extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException
	{
		String mail= req.getParameter("lmail");
		String num= req.getParameter("lnum");
		String url= "jdbc:mysql://localhost:3306?user=root&password=12345";
		String sel="select * from ismartdb.ismartorg where email=? and enumber=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(sel);
			ps.setString(1, mail);
			ps.setString(2, num);
			ResultSet rs = ps.executeQuery();
			PrintWriter pw = res.getWriter();
			if(rs.next())
			{
				String name=rs.getString(1);
				int id = rs.getInt(2);
				String mla=rs.getString(3);
				String number=rs.getString(4);
				Date dob=rs.getDate(5);
				Date dd=rs.getDate(6);
				int sal = rs.getInt(7);
				String nati = rs.getString(8);
				pw.println("Details of Emp");
				pw.println("Name Of Emp: "+name);
				pw.println("Id Of Emp: "+id);
				pw.println("Mail Of Emp: "+mla);
				pw.println("Mob.Num Of Emp: "+number);
				pw.println("Emp DOB: "+dob);
				pw.println("Emp dateOfJoining: "+dd);
				pw.println("EMp Sal: "+sal);
				pw.println("Emp Native: "+nati);
				
			}
			
			else
			{
				pw.println("Ur Not an Emp Of Ismartorg...!");
			}
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
