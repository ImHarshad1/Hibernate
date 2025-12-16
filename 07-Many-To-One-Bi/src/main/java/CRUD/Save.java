package CRUD;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Product;
import Entity.Review;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p = new Product();
		p.setName("IPhone");
		
		Review r1 = new Review();
		r1.setMsg("Good Phone");
		r1.setProduct(p);

		Review r2 = new Review();
		r2.setMsg("Good Camera Quality");
		r2.setProduct(p);
		
		Review r3 = new Review();
		r3.setMsg("Nice");
		r3.setProduct(p);
		
		p.setRev(Arrays.asList(r1,r2,r3));
		
		et.begin();
		em.persist(p);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();
		System.out.println("Saved");
	}

}
