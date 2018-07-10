package com.jac.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorController
 */
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorController() {
        super();
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
		String numberoneS = request.getParameter("numberone");
		String numbertwoS = request.getParameter("numbertwo");
		String operation = request.getParameter("operation");
	
		int numberone = Integer.parseInt(numberoneS);
		int numbertwo = Integer.parseInt(numbertwoS);
		String result=null;
		
		if ((!operation.equals("add") ||(!operation.equals("subtract") ||(!operation.equals("multiply") || (!operation.equals("divide"))
				{
			result = "Please choose add, subtract, multiply and divide";
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
			rd.include(request, response);
			
		}
		
		//if add was entered
		if(operation.equals("add")) {
			
		int numResult=numberone +numbertwo;
		result = Integer.toString(numResult);
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.include(request, response);
		
		}
		
		//if subtract was entered
				if(operation.equals("subtract")) {
					
				int numResult=numberone -numbertwo;
				result = Integer.toString(numResult);
				request.setAttribute("result", result);
				RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
				rd.include(request, response);
				
				}
	//if multiply was entered
				if(operation.equals("multiply")) {
					
				int numResult=numberone * numbertwo;
				result = Integer.toString(numResult);
				request.setAttribute("result", result);
				RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
				rd.include(request, response);
				
				}	
				//if divide was entered
				if(operation.equals("multiply")) {
					
				int numResult=numberone / numbertwo;
				result = Integer.toString(numResult);
				request.setAttribute("result", result);
				RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
				rd.include(request, response);
				
				}		
		
	}

}
