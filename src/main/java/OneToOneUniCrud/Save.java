package OneToOneUniCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneUniENtity.Car;
import OneToOneUniENtity.Engine;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = new Car();
		car.setCid(102);
		car.setBrand("BMW");
		car.setPrice(9000000.0);
		
		Engine engine = new Engine();
		engine.setEid(3);
		engine.setcc(900.0);
		
		car.setEngine(engine);
		
		et.begin();
		em.persist(car);
		em.persist(engine);	//for Cascade no need to save engine it does Automatically
		et.commit();
		
		System.out.println("Saved");
	}

}
