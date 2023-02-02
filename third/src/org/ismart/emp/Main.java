package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Main")
public class Main extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
ServletException, IOException {

	String tempopt=req.getParameter("opt");
	int option=Integer.parseInt(tempopt);
	PrintWriter pw= resp.getWriter();
	switch (option) 
	{
	case 1:
			RequestDispatcher r = req.getRequestDispatcher("Register.html");
			r.include(req, resp);
		
		break;
	case 2:
		RequestDispatcher u = req.getRequestDispatcher("Update.html");
			u.include(req, resp);
		
		break;
	case 3:
		RequestDispatcher d = req.getRequestDispatcher("Delete.html");
			d.include(req, resp);
		
		break;
	case 4:
		RequestDispatcher s = req.getRequestDispatcher("Login.html");
			s.include(req, resp);
		
		break;
	default:
		pw.println("Enter Valid Input...!");
		break;
	}
	
	
	/*if (option==1)
	{
		resp.sendRedirect("Register.html");
		
	} 
	else 
	{
		RequestDispatcher rd= req.getRequestDispatcher("Mainn.html");
		rd.include(req, resp);

	}*/
}

}
