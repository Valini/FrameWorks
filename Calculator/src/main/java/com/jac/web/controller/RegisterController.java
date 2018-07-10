package com.jac.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jac.web.dao.UserDAO;
import com.jac.web.model.User;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String aptnoS = request.getParameter("aptno");
		int aptno = Integer.parseInt(aptnoS);
		
		String result=null;
		//if username Name or price is empty
				if(username.equals(null) || password.equals(null) ) {
					result="Please enter information";
					
				}
				
				
				else {
					//check if username exists in database
					
					UserDAO s1= new UserDAO();
							
					User user=s1.getUserbyUsername(username);
					if (user.equals(null)) {
						result="Please enter another usename";
					}
					else {
					
					//create new user and add
						User newuser = new User();
						newuser.setUsername(username);
						newuser.setPassword(password);
						newuser.setAptno(aptno);
				
			
						UserDAO p1= new UserDAO();
						result= p1.addUser(newuser);
					}
				
					
				}
				//send response to admin
				request.setAttribute("result", result);
				response.setContentType("text/html");
				
				
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);
			}

			
	

}
