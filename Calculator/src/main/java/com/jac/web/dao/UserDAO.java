package com.jac.web.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jac.web.model.User;

public class UserDAO {
	
	
	public String addUser(User user) {
		 
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		  String result;
		  User p2 = new User();
		 
		  p2.setId(0);
		  p2.setUsername(user.getUsername());
		  p2.setPassword(user.getPassword());
		  p2.setAptno(user.getAptno());
		  
			
		  
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
				result="User has been added successfully";
			}
			
			else {
				result="User has not been added successfully";
				
			}
			//Product product1 = em.find(Product.class, 147);
			//System.out.println(product1);
			//Close EntityManager and EntityManagerFactory
			em.close( );
			emf.close( );
		 
			 return result;
	 }
	public User getUser(String username) {
		
		 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

		  EntityManager em = emf.createEntityManager();
		  
		  User userInDB=null;
			try {

				String query = "from Users where username= :username";
				Query query2 =  em.createQuery(query);
				query2.setParameter("username", username);

				
				userInDB = (User) query2.getSingleResult();
				
					System.out.println(userInDB);
					

			
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close( );
			emf.close( );
	
			return userInDB;
		
		
		
		
	}
	public User getUserbyUsername(String username) {
		
		
			
			 EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

			  EntityManager em = emf.createEntityManager();
			  
			  User userInDB=null;
				try {

					String query = "from Users where username= :username";
					Query query2 =  em.createQuery(query);
					query2.setParameter("username", username);

					
					userInDB = (User) query2.getSingleResult();
					
						//System.out.println(productInDB);
						

				
				} catch (Exception e) {
					e.printStackTrace();
				}
				em.close( );
				emf.close( );
		
				return userInDB;
			
			
			
			
		
		
	}
	 

}
