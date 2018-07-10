package com.jac.web.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jac.web.model.Product;

import com.jac.web.model.User;

public class ProductDAO {
	
	 public String AddProduct(Product product) {
		 
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		  String result;
		  Product p2 = new Product();
		  p2.setProductID(0);
			p2.setProductName(product.getProductName());
			p2.setProductPrice(product.getProductPrice());
		  
		try {
			//Begin the transaction
			em.getTransaction().begin();
			//Call persist method 
			em.persist( p2 );
			//And commit the transaction
			em.getTransaction( ).commit( );
			}
		catch(Exception e){
            e.printStackTrace();
        }
			
			if(em.contains(p2))
			{
				result="Product has been added successfully";
			}
			
			else {
				result="Product has not been added successfully";
				
			}
			Product product1 = em.find(Product.class, 147);
			System.out.println(product1);
			//Close EntityManager and EntityManagerFactory
			em.close( );
			emf.close( );
		 
			 return result;
	 }
	 
	 public ArrayList<Product> getAllProducts() {
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		 
			ArrayList<Product> productsInDB= null;
			try {
				//Create Query Object
				String query = "Select s from Product s";
			Query query2 = (Query) em.createQuery(query);
			productsInDB = (ArrayList<Product>)query2.getResultList();
			
			//for (Product Product : productsInDB) {
			//	System.out.println(productsInDB);
		//}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close( );
			emf.close( );
			return productsInDB;
		}
	
	 public String DeleteProduct(int id) {
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		  
			String result = null;
			try {
				Product product = em.find(Product.class, id);
				
				//Begin the transaction
						em.getTransaction().begin();
						//Call persist method 
						em.remove( product );
						//And commit the transaction
						em.getTransaction( ).commit( );
						//System.out.println(student3);
						if(em.contains(product))
						{
							result="product has not been deleted";
						}
						
						else {
							result="Product has been successfully deleted";
							
						}			
				
				
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close( );
			emf.close( );
	
			return result;
			
		}
	public Product GetProductbyId(int id) {
		
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		  
		  Product productInDB=null;
			try {

				String query = "from Product where id= :productId";
				Query query2 =  em.createQuery(query);
				query2.setParameter("productId", id);

				
				productInDB = (Product) query2.getSingleResult();
				
					System.out.println(productInDB);
					

			
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close( );
			emf.close( );
	
			return productInDB;
		
		
		
		
	}

	public String UpdateProduct(Product product) {
		EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		  String result=null;
		  int id=product.getProductID();
		  String productName=product.getProductName();
		  Double productPrice=product.getProductPrice();
		  try {
		//Update
			Product productUpdated = em.find(Product.class, id);
			
			//set new parameters
			productUpdated.setProductID(id);
			productUpdated.setProductName(productName);
			productUpdated.setProductPrice(productPrice);
			
			//Begin the transaction
					em.getTransaction().begin();
					//Call persist method 
					em.persist( productUpdated );
					//And commit the transaction
					em.getTransaction( ).commit( );
					System.out.println(productUpdated);
					if(em.contains(product))
					{
						result="product has not been updated";
					}
					
					else {
						result="Product has been successfully updated";
						
					}		
					}
		  catch (Exception e) {
				e.printStackTrace();
				}
					em.close( );
					emf.close( );
					return result;
	}
	
	public ArrayList<Product> getProductsbyNameLike(String productName) {
		
		
		
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		 
			ArrayList<Product> productsInDB= null;
			try {
				//Create Query Objectlike 
				//String temp = "%"+productName+"%";
				String query = "from Product where productName like :productName";
				
			Query query2 = (Query) em.createQuery(query);
			query2.setParameter("productName", "%" + productName + "%");
			//query2.setParameter(0, temp);

			productsInDB = (ArrayList<Product>)query2.getResultList();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close( );
			emf.close( );
			return productsInDB;
		
		
		
		
		
	}


}
