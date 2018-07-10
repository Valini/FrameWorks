package com.jac.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jac.web.model.User;

public class UserDAO {

	  public User getUser(String userName) {
			EntityManagerFactory emf =   Persistence.createEntityManagerFactory("punit1");

			  EntityManager em = emf.createEntityManager();
			  User user=null;
			    try {
			    //Create Query Object
			    	String query = "from User where userName= :user";
					Query query2 =  em.createQuery(query);
					query2.setParameter("user", userName);

					
					user = (User) query2.getSingleResult();
					
						System.out.println(user);
				
					
							em.close( );
						emf.close( );
			      } catch (Exception e) {
			        e.printStackTrace();
			      }
			      
			        
			       
			        return user ;
			        
	  }
	  
	  
	             
	  

}
