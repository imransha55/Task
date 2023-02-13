package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/CreateDbb")
public class CreateDbb extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException
	{
		String u=req.getParameter("name");
		String p=req.getParameter("password");
		String datab=req.getParameter("db");
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String user=u;
		String psw=p;
		
		String sql="create database ismart";
		PrintWriter pw = res.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			Statement st=con.createStatement();
			st.executeUpdate(sql);
			pw.println("DataBase Created With The Name: "+datab);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
