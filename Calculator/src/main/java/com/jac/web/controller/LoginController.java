package com.jac.web.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.jac.web.dao.UserDAO;

import com.jac.web.model.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		
		System.out.println("Logging out, session was removed");
		response.sendRedirect("welcome.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//check if username and password match in database using DAO
	
		UserDAO user = new UserDAO();
		//call method get User from DAO to check if this user exists in database
		User s1 = user.getUser(username);
//		if username or password is null
		if(s1 == null) {
				request.setAttribute("error", "Wrong username or password.");
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);	
		}
		else {
	
	//check if password entered by user matches password in database
		if(password.equals(s1.getPassword())) {
			//if(password.equals(passwordInDB)){
			request.setAttribute("username", username);
			request.setAttribute("user", s1);
			//create session
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
			rd.forward(request, response);
	
		
	} else {
		request.setAttribute("username", null);
		request.setAttribute("error", 
				"Wrong username or password.");
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	}
		}
		}
	
	

}
