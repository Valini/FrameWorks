

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import test.Student;
import test.Person;


@WebServlet("/student")
public class student extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		
		Person person =new Person(); 
		person.setName(name);
		person.setId(id);
		
		//save to text file
		
		request.setAttribute("person", person);
		RequestDispatcher rd= request.getRequestDispatcher("person.jsp");
		rd.include(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data from the request
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		//send the html response to user
	//String result="Your username is" + username + "and your password is " + password;
		//response.setContentType("text/html");
		//PrintWriter pw = response.getWriter();
		//pw.write(result);
		
		//request another jsp page- sending data
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		RequestDispatcher rd=request.getRequestDispatcher("test2.jsp");
		rd.include(request, response);
		
	}

}
