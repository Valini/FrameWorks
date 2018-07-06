package com.jac.web.model;

public class MainApp {

	public static void main(String[] args) {
		EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("punit1");

		EntityManager em = emf.createEntityManager();

		Student s1 = em.find(Student.class, 102);

		System.out.println(s1);


	}

}
