package OneToOneUniCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneUniENtity.Car;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = em.find(Car.class, 101);
		
		if(car != null) {
			car.setPrice(8000000);
			
			et.begin();
			em.merge(car);
			et.commit();
		} else {
			System.out.println("Not found");
		}
	}
}
