package com.jac.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jac.web.dao.ProductDAO;
import com.jac.web.model.Product;



/**
 * Servlet implementation class AdminController
 */
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
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
		String result;
		String productName = request.getParameter("productName");
		Double productPrice =  Double.parseDouble(request.getParameter("productPrice"));
		//if product Name or price is empty
		if(productName.equals(null) || productPrice.equals(null)) {
			result="Please enter product";
			
		}
		else {
		Product product = new Product();
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		
		ProductDAO p1= new ProductDAO();
		result= p1.AddProduct(product);
			
		}
		
		//send response to admin
		request.setAttribute("result", result);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*out.write("<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Servlet.jsp</title>\r\n" + 
				"<body>\r\n" + 
				"	<h2>"+result+"</h2>\r\n" + 
				"</body>\r\n" + 
				"</html>");*/
		//refresh the product list
		ProductDAO products= new ProductDAO();
		ArrayList<Product> productList=products.getAllProducts();
		request.setAttribute("productList", productList);
		
	RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
	rd.include(request, response);
	}

}
