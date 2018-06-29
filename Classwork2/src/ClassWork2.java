import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassWork2
 */
@WebServlet("/ClassWork2")
public class ClassWork2 extends HttpServlet {
	
    
	Connection conn = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//sending a response that will be in html format/file
				response.setContentType("text/html");
				
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				//before connection to database check that you have the values
				System.out.println(username +password);
				
				
		
	}

}
