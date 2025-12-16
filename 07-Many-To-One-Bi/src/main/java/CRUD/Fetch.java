package CRUD;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Product;
import Entity.Review;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Product p = em.find(Product.class, 1);
		System.out.println("================Product==================");
		if(p != null) {
			System.out.println(p.getPid());
			System.out.println(p.getName());
			
			
		List<Review> r = p.getRev();
		System.out.println("================Review====================");
		for(Review i:r) {
			System.out.println(i.getRid());
			System.out.println(i.getMsg());
			System.out.println("------------------------------");
		}
			System.out.println("Saved");
		} else {
			System.out.println("Not Found");
		}

	}

}
