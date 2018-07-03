
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.Student;
/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//sending a response that will be in html format/file
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String result= "Your username  is " + username + "password :"+password;
		
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h2>" + result + "</h2></body></html>");
		
		//request another jsp page- sending data
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		RequestDispatcher rd=request.getRequestDispatcher("test2.jsp");
		rd.include(request, response);
		
		
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		int ID = Integer.parseInt(request.getParameter("id"));
		
		Student student = new Student();
		student.setName(name);
		student.setStudentID(ID);
		
		//save to text file
		
		request.setAttribute("student", student);
		RequestDispatcher rd= request.getRequestDispatcher("student.jsp");
		rd.include(request, response);
		
		
	}

}