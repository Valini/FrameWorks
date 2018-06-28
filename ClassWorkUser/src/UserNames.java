

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserNames
 */
@WebServlet("/UserNames")
public class UserNames extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		String username1 = request.getParameter("username1");
		String username2 = request.getParameter("username2");
		String password = request.getParameter("password");
		String result="";
		PrintWriter pw = response.getWriter();
		if(username1.equalsIgnoreCase(username2)) {
			
			result= "Your username  is " + username1 + "password :"+password;
			
		}
		
		else
			
		{
			result="Usernames do not match";
			
		}
		
		pw.write("<html><body><h2>" + result + "</h2></body></html>");
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
