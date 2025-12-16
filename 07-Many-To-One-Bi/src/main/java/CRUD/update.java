package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Review;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Review r = em.find(Review.class, 3);
		if(r != null) {
			et.begin();
			r.setMsg("Video Quality is to Good");
			em.persist(r);
			et.commit();
			System.out.println("Saved");
		} else {
			System.out.println("Not Found");
		}

	}

}
