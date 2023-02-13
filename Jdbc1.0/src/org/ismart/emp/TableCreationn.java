package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TableCreationn")
public class TableCreationn  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String tabname=req.getParameter("table");
		String id=req.getParameter("tid");
		String name=req.getParameter("tname");
		String dept=req.getParameter("tdept");
		String sal=req.getParameter("tsal");
		String num=req.getParameter("tnum");
		
		
		String url ="jdbc:mysql://localhost/ismartdb";
		String db= "ismartdb";
		String user="root";
		String pass="12345";
		String crt="create table tabname "+"(id int,"+"name varchar(50),"+"dept varchar(20),"+""
				+ "sal int,"+"num varchar(10),"+"PrimaryKey(id))";
		
		PrintWriter pw = resp.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(crt);
			pw.println("Tabel has Created in"+db+"Database");
			
			pw.println("Table Description...!");
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM "+tabname);
		    ResultSetMetaData metaData = resultSet.getMetaData();
		    System.out.println("Number of columns: "+metaData.getColumnCount());
		    System.out.println("Table description...!");
		    for(int i=1;i< metaData.getColumnCount();i++)
		    {
		      System.out.println(metaData.getColumnName(i)+"\t"+metaData.getColumnTypeName(i));
		    }
			
			
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}

}