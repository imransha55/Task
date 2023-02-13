package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sortt")
public class Sortt extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
			String tempoption=req.getParameter("opt");
			int option=Integer.parseInt(tempoption);
			String Dsort= "select * from ismart.eemp order by eid desc";
			String Asort= "select * from ismart.eemp order by ename asc";
			String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
			PrintWriter pw = resp.getWriter();
			pw.println("<html><body>");
			pw.println("<table border=1><tr>"+"<td><b>Ename</b></td>"+"<td><b>Eid</b></td>"+"<td><b>Email</b></td>"+"<td><b>Enumber</b></td>"
					+"<td><b>Edob</b></td>"+"<td><b>Edoj</b></td>"+"<td><b>Esal</b></td>"+"<td><b>Enative</b></td>");
			try
			{	Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url);
				Statement stmt = con.createStatement();
				
				if (option ==2)
				{
					ResultSet rs = stmt.executeQuery(Dsort);
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
				
						
						pw.println("<tr>"+"<td>"+name+"</td>"+"<td>"+id+"</td>"+"<td>"+mla+"</td>"+"<td>"+number+"</td>"+"<td>"+dob+"</td>"+"<td>"+dd+"</td>"+"<td>"+sal+"</td>"+"<td>"+nati+"</td></tr>");
					}
					pw.println("</table></body></html>");
					
				} 
				else if (option==1)
				{
					ResultSet rs1=stmt.executeQuery(Asort);
					while(rs1.next())
					{
						String name=rs1.getString(1);
						int id = rs1.getInt(2);
						String mla=rs1.getString(3);
						String number=rs1.getString(4);
						Date dob=rs1.getDate(5);
						Date dd=rs1.getDate(6);
						int sal = rs1.getInt(7);
						String nati = rs1.getString(8);
				
						
						pw.println("<tr>"+"<td>"+name+"</td>"+"<td>"+id+"</td>"+"<td>"+mla+"</td>"+"<td>"+number+"</td>"+"<td>"+dob+"</td>"+"<td>"+dd+"</td>"+"<td>"+sal+"</td>"+"<td>"+nati+"</td></tr>");
					}
					pw.println("</table></body></html>");
				}
				
				
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	
	}

}
