package CacheMemory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Annotations.User;

public class save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user = new User();
		user.setName("D");
		user.setEmail("d@gmail.com");
		user.setPhone(12345678);

		User user2 = new User();
		user.setName("A");
		user.setEmail("345678");
		
		et.begin();
		em.persist(user);
		et.commit();

		System.out.println("saved");

	}

}
