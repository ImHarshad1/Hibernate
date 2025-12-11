package MantToOneCRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ManytoOneEntity.Product;
import com.ManytoOneEntity.Review;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Review r = em.find(Review.class, 103);
		
		if(r != null) {
			System.out.println("==========Review=========");
			System.out.println(r.getRid());
			System.out.println(r.getMessage());
			
			Product p = em.find(Product.class, 1);
			System.out.println("==========Product========");
			System.out.println(p.getPid());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
		} else {
			System.out.println("Not Found");
		}	
	}
}