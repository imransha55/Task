
package Add.eco;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Reg")
public class Reg extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String name=req.getParameter("an");
		String mob=req.getParameter("am");
		String mail=req.getParameter("ae");
		String lname=req.getParameter("ln");
		String pass=req.getParameter("psw");
		PrintWriter pw=resp.getWriter();
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String insert="insert into ecom.aregistration values(?,?,?,?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url);
			PreparedStatement ps= con.prepareStatement(insert);
			ps.setString(1,name);
			ps.setString(2,mob);
			ps.setString(3,mail);
			ps.setString(4,lname);
			ps.setString(5,pass);
			int i=ps.executeUpdate();
			

			if (i>0) 
			{
				pw.printf("-------------------------------------------------------------------------------%n");
				pw.printf("  Details-Of-Registered-Admin   %n");
				
				pw.printf("--------------------------------------------------------------------------------%n");
				pw.printf("| %-12s | %-10s | %-8s | %-6s | %-4s | %n", "Admin-Name", "Mobile", "Mail           .", "Login-Name", "Password");
				pw.printf("--------------------------------------------------------------------------------%n");

				pw.printf("| %-12s | %-10s | %-8s | %-6s | %-4s | %n", name, mob , mail , lname ,pass );
				pw.printf("--------------------------------------------------------------------------------%n");
				//resp.sendRedirect("https://www.google.com");
			} 
			else 
			{
				
				RequestDispatcher rd=req.getRequestDispatcher("AdminReg.jsp");
				rd.include(req, resp);	
			}
			con.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	
	}

}
