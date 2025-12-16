package ManyToMAny;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		studentt s = new studentt();
		s.setName("Bob");
		
		coursee c = new coursee();
		c.setTitle("Maths");
		
		coursee c1 = new coursee();
		c1.setTitle("Java");
		
		coursee c2 = new coursee();
		c2.setTitle("Python");
		
		s.setCourse(Arrays.asList(c,c1,c2));
		
		et.begin();
		em.persist(s);
		em.persist(c);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		
		System.out.println("Saved");
	}
}
