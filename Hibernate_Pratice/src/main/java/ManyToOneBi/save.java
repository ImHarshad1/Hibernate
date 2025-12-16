package ManyToOneBi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p = new Product();
		p.setName("Apple");

		Review r = new Review();
		r.setMsg("Good Phone");
		r.setProduct(p);
		
		Review r1 = new Review();
		r1.setMsg("Camera is Very Very Sexyyyy");
		r1.setProduct(p);
		
		Review r2 = new Review();
		r2.setMsg("100X IS GOOD");
		r2.setProduct(p);
		
		et.begin();
		em.persist(p);
		em.persist(r);
		em.persist(r1);
		em.persist(r2);
		et.commit();
		
		System.out.println("Saved");
	}

}
