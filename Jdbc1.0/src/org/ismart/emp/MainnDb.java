package org.ismart.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainnDb")
public class MainnDb extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		String tempopt= req.getParameter("opt");
		int option=Integer.parseInt(tempopt);
		PrintWriter pw= resp.getWriter();
		switch (option) 
		{
		case 1:
				RequestDispatcher c = req.getRequestDispatcher("CreateDb.html");
				c.include(req, resp);
			
			break;
		case 2:
			RequestDispatcher r= req.getRequestDispatcher("Register.html");
				r.include(req, resp);
			
			break;
		case 3:
			RequestDispatcher elog = req.getRequestDispatcher("EmpLog.html");
				elog.include(req, resp);
			
			break;
		case 4:
			RequestDispatcher hlog= req.getRequestDispatcher("HrLog.html");
			hlog.include(req, resp);
			break;
		case 5:
			RequestDispatcher up = req.getRequestDispatcher("Updation.html");
			up.include(req, resp);
			break;
		case 6:
			RequestDispatcher sor = req.getRequestDispatcher("Sort.html");
			sor.include(req, resp);
			break;
		
		case 7:
			RequestDispatcher rem= req.getRequestDispatcher("Removing.html");
			rem.include(req, resp);
			break;
		
		case 8:
			RequestDispatcher dt= req.getRequestDispatcher("DropTable.html");
			dt.include(req, resp);
			break;
		
		case 9:
			RequestDispatcher db = req.getRequestDispatcher("DropDb.html");
			db.include(req, resp);
			break;
		
		

		default:
			pw.println("Enter Valid Input...!");
			break;
		}

		
	
	}
	
	

}
