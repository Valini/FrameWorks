package com.jac.web.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("punit1");

		EntityManager em = emf.createEntityManager();

		//Student student = em.find(Student.class, 102);

		//System.out.println(student);
		/*
		//Create data in student obj
		Student s2 = new Student();
		s2.setStudentID(1000);
		s2.setUserName("test1");
		s2.setPassword("test-pass");
		s2.setCity("test-city");

		//Begin the transaction
		em.getTransaction().begin();
		//Call persist method 
		em.persist( s2 );
		//And commit the transaction
		em.getTransaction( ).commit( );
		
		Student student2 = em.find(Student.class, 1000);
		System.out.println(student2);
		//Close EntityManager and EntityManagerFactory
		//em.close( );
		//emf.close( );
		
		//Update
		Student student3 = em.find(Student.class, 1000);
		student3.setCity("Kirkland");
		//Begin the transaction
				em.getTransaction().begin();
				//Call persist method 
				em.persist( student3 );
				//And commit the transaction
				em.getTransaction( ).commit( );
				System.out.println(student3);
				em.close( );
				emf.close( );*/
				
		//remove
//		Student student3 = em.find(Student.class, 1000);
//		//student3.setCity("Kirkland");
//		//Begin the transaction
//				em.getTransaction().begin();
//				//Call persist method 
//				em.remove( student3 );
//				//And commit the transaction
//				em.getTransaction( ).commit( );
//				//System.out.println(student3);
//				em.close( );
//				emf.close( );
				
//		//query
//				//Create Query Object
//				String query = "Select s from Student s";
//				Query query2 = (Query) em.createQuery(query);
//				List<Student> list = (List<Student>)query2.getResultList();
//				
//				for (Student st : list) {
//					System.out.println(st);
//				}
//				
//				//query
//				//Create Query Object
//				String query1 = "Select s.userName from Student s";
//				Query query3 = (Query) em.createQuery(query1);
//				List<String> list2 = (List<String>)query3.getResultList();
//				
//				for (String st : list2) {
//					System.out.println(st);
//				}
//				
				
//		//Create Query Object
//		String query = "from Student where userName= :user";
//		Query query2 =  em.createQuery(query);
//		query2.setParameter("user", "Paul");
//
//		List<Student> list = (List<Student>)query2.getResultList();
//		
//		for (Student st : list) {
//			System.out.println(st);
//		}
//		
		
		String query = "from Student where userName= :user";
		Query query2 =  em.createQuery(query);
		query2.setParameter("user", "Paul");

		
		Student st = (Student) query2.getSingleResult();
		
			System.out.println(st);
	
		
				em.close( );
			emf.close( );
	}

}
