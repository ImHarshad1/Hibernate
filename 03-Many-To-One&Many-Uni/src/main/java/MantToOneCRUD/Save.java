package MantToOneCRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ManytoOneEntity.Product;
import com.ManytoOneEntity.Review;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p = new Product();
		p.setPid(1);
		p.setName("I Phone");
		p.setPrice(80000);
		
		Review r1 = new Review();
		r1.setRid(101);
		r1.setMessage("Good Phone");
		r1.setProduct(p);
		
		Review r2 = new Review();
		r2.setRid(102);
		r2.setMessage("Camera Quality is Top Notch");
		r2.setProduct(p);
		
		Review r3 = new Review();
		r3.setRid(103);
		r3.setMessage("Worth it!!");
		r3.setProduct(p);
		
		et.begin();
		em.persist(p);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();
		System.out.println("Saved");
		
	}

}
