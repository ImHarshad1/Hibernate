package ManyToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p = em.find(Product.class, 11);
		if(p!=null) {
			et.begin();
			p.setName("Samsung");
			em.merge(p);
			et.commit();
			System.out.println("Updated");
			} else {
				System.out.println("Not Found");
			}
		
//		Review r = em.find(Review.class, 14);
//		if(r!=null) {
//		et.begin();
//		r.setMsg("Camera Quality is Top Notch");
//		em.merge(r);
//		et.commit();
//		System.out.println("Updated");
//		} else {
//			System.out.println("Not Found");
//		}
	}

}
