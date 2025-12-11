package MantToOneCRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ManytoOneEntity.Product;
import com.ManytoOneEntity.Review;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Review r = em.find(Review.class, 101);
		
		if(r != null) {
			et.begin();
			r.setMessage("Baap Phone he Bhai");
			em.persist(r);
			et.commit();
		} else {
			System.out.println("Not Found");
		}	

	}

}
