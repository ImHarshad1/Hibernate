package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Car;
import Entity.Engine;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c = new Car();
		c.setBrand("Mercedes");
		
		Engine e =new Engine();
		e.setCc(1000);
		
		c.setEngine(e);
		
		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
		System.out.println("Saved");
	}
}