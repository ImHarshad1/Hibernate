package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Car;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c = em.find(Car.class, 4);
		if(c != null) {
			et.begin();
			c.setBrand("BMW");
			em.persist(c);
			et.commit();
			System.out.println("Saved");
		} else {
			System.out.println("Not Found");
		}

	}

}
