package OneToOneUniCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneUniENtity.Car;
import OneToOneUniENtity.Engine;

public class fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Car c = em.find(Car.class, 102);
		
		if(c != null) {
			System.out.println("========Car========");
			System.out.println(c.getCid());
			System.out.println(c.getBrand());
			System.out.println(c.getPrice());
			
			Engine engine = c.getEngine();
			System.out.println("=======Engine======");
			System.out.println(engine.getEid());
			System.out.println(engine.getcc());
			
		} else {
			System.out.println("Car Not Found");
		}
	}
}
