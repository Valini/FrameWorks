package com.jac.web.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jac.web.dao.ProductDAO;
import com.jac.web.model.Product;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchProductName = request.getParameter("searchAction");
        //search the database for this product
		if(searchProductName == null ||searchProductName.equals("")) {
			//refresh the product list
			ProductDAO products= new ProductDAO();
			ArrayList<Product> productList=products.getAllProducts();
			request.setAttribute("productList", productList);
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);  
		}
		else {
		ProductDAO products= new ProductDAO();
		//ArrayList<Product> productList=products.GetProductsbyName(searchProductName);
		ArrayList<Product> productList=products.GetProductsbyNameLike(searchProductName);
		request.setAttribute("productList", productList);
		RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
		rd.forward(request, response);  
            }
     
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
