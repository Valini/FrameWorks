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
 * Servlet implementation class ListController
 */
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListController() {
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
		String result= p1.DeleteProduct(id);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
