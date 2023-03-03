package Add.eco;

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
@WebServlet("/UpdateAdmin")
public class UpdateAdmin extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		String oldmail=req.getParameter("omail");
		String mail=req.getParameter("nmail");
		String num= req.getParameter("nnum");
		String lname=req.getParameter("nlname");
		String url ="jdbc:mysql://localhost:3306?user=root&password=12345";
		String update= "update ecom.aregistration set email=? , amobile=? , alogname=? where email=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1,mail);
			ps.setString(2, lname);
			ps.setString(3, num);
			ps.setString(4, oldmail);
			int s= ps.executeUpdate();
			PrintWriter pw = resp.getWriter();
			if(s>0)
			{
				pw.println("Your Records UPDATED to:");
				
			}
			else
			{
				pw.println("Invalid Old Mail...!");
			}
		
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
