package com.jac.web.dao;

import java.awt.List;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jac.web.model.Product;

public class ProductDAO {
	
	//method to get PRODUCT from database
		public Product getProduct(String productName) {
			Product p1 = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/assignment2", "root", "root");
				String query = "select * from product where productName=?";
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, productName);
				ResultSet rs = st.executeQuery();
				
				if(rs.next()) {
					p1 = new Product();
					String productNameFromDB = rs.getString("productName");
					String productPriceFromDB = rs.getString("productPrice");
					
					p1.setProductName(productNameFromDB);
					p1.setProductPrice(Integer.parseInt(productPriceFromDB));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return p1;
		}
		
		public String AddProduct(Product product) {
			Product p1 = null;
			String result = "Product save was not successful";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/assignment2", "root", "root");
				
				
				//String query = "insert into product values(?,?,?)";
				String query = "insert into product (productName, productPrice) values(?,?)";
				PreparedStatement st = con.prepareStatement(query);
				//st.setInt(1, 0);
				st.setString(1, product.getProductName());
				st.setDouble(2, product.getProductPrice());
				
				int res = st.executeUpdate();
				
				if(res == 1) {
					result = "Product successfully saved!";
				}
				
				con.close();
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
			
		}
		
		
		public ArrayList<Product> getAllProducts() {
			ArrayList<Product> productsInDB= new ArrayList<Product>();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/assignment2", "root", "root");
				String query = "select * from product";
				PreparedStatement st = con.prepareStatement(query);
				//st.setString(1, productName);
				ResultSet rs = st.executeQuery();
				
				while(rs.next()) {
					Product p1 = new Product();
					int productIdFromDB=rs.getInt("id");
					String productNameFromDB = rs.getString("productName");
					String productPriceFromDB = rs.getString("productPrice");
					
					p1.setId(productIdFromDB);
					p1.setProductName(productNameFromDB);
					p1.setProductPrice(Double.parseDouble(productPriceFromDB));
					productsInDB.add(p1);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return productsInDB;
		}
		public String DeleteProduct(int id) {
			//Product p1 = null;
			String result = "Product was not successfully deleted";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/assignment2", "root", "root");
				
				String query = "delete from product where id =?";
				PreparedStatement st = con.prepareStatement(query);
				st.setInt(1, id);
				
				
				int res = st.executeUpdate();
				
				if(res == 1) {
					result = "Product successfully deleted!";
				}
				
				con.close();
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
			
		}

}
