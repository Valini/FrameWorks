package com.jac.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jac.web.dao.StudentDAO;
import com.jac.web.model.Student;

/**
 * Servlet implementation class loginStudent
 */
public class loginStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public loginStudent() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		StudentDAO student = new StudentDAO();
		Student s1 = student.getStudent(username);
		if(s1==null) {
			request.setAttribute("error", "Worng username or password");
			
		}else if(password.equals(s1.getPassword())){
			request.setAttribute("username", "username");
			request.setAttribute("student", s1);
		}
		
		request.setAttribute("username", null);
//		if(username.equals("admin")&& password.equals("admin"))
		if(password.equals(s1.getPassword())){
			request.setAttribute("username", "username");
			
			
			
			//Student s1=new Student();
			//s1.setUsername(username);
			//s1.setUsername(password);
			request.setAttribute("student", s1);
			
			
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);
			
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
		}
		
		
		
		
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
