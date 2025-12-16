package ManyToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetchReview {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Review r = em.find(Review.class, 12);
		System.out.println("==============Review===========");
		if(r!=null) {
			System.out.println(r.getRid());
			System.out.println(r.getMsg());
			
			Product p = r.getProduct();
			System.out.println("==============Product===========");
			System.out.println(p.getPid());
			System.out.println(p.getName());
			
			System.out.println("---------------------------");
		}

	}

}
