package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HrLogg")
public class HrLogg extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
	
		PrintWriter pw = resp.getWriter();
		pw.println("<html><body>");
		pw.println("<table border=1><tr>"+"<td><b>Ename</b></td>"+"<td><b>Eid</b></td>"+"<td><b>Email</b></td>"+"<td><b>Enumber</b></td>"
				+"<td><b>Edob</b></td>"+"<td><b>Edoj</b></td>"+"<td><b>Esal</b></td>"+"<td><b>Enative</b></td>");
		String url= "jdbc:mysql://localhost:3306?user=root&password=12345";
		String sel="select * from ismart.eemp";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(sel);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String name=rs.getString(1);
				int id = rs.getInt(2);
				String mla=rs.getString(3);
				String number=rs.getString(4);
				Date dob=rs.getDate(5);
				Date dd=rs.getDate(6);
				int sal = rs.getInt(7);
				String nati = rs.getString(8);
				/*pw.println("Details of Emp");
				pw.println("Name Of Emp: "+name);
				pw.println("Id Of Emp: "+id);
				pw.println("Mail Of Emp: "+mla);
				pw.println("Mob.Num Of Emp: "+number);
				pw.println("Emp DOB: "+dob);
				pw.println("Emp dateOfJoining: "+dd);
				pw.println("EMp Sal: "+sal);
				pw.println("Emp Native: "+nati);
				pw.println("-----------------------------");*/
				
				pw.println("<tr>"+"<td>"+name+"</td>"+"<td>"+id+"</td>"+"<td>"+mla+"</td>"+"<td>"+number+"</td>"+"<td>"+dob+"</td>"+"<td>"+dd+"</td>"+"<td>"+sal+"</td>"+"<td>"+nati+"</td></tr>");
			}
			pw.println("</table></body></html>");
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
