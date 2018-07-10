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
 * Servlet implementation class EditController
 */
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId = request.getParameter("productId");
		int id= Integer.parseInt(productId);
		ProductDAO p1= new ProductDAO();
		Product product = p1.GetProductbyId(id);
		request.setAttribute("productById", product);
		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productID=Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		Double productPrice =  Double.parseDouble(request.getParameter("productPrice"));
		Product updatedProduct= new Product();
		updatedProduct.setProductID(productID);
		updatedProduct.setProductName(productName);
		updatedProduct.setProductPrice(productPrice);
		ProductDAO p1= new ProductDAO();
		 String result= p1.UpdateProduct(updatedProduct);
		//refresh the product list
			ProductDAO products= new ProductDAO();
			ArrayList<Product> productList=products.getAllProducts();
			request.setAttribute("productList", productList);
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);  
	}

}
