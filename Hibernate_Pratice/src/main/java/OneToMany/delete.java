package OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Book b = em.find(Book.class, 3);
		Author a = em.find(Author.class, 1);
		et.begin();
		em.remove(a);
		et.commit();
		System.out.println("Delected");
	}

}
