package OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Author a1 = em.find(Author.class, 1);
		System.out.println("==========Author===========");
		if(a1!=null) {
		System.out.println(a1.getAid());
		System.out.println(a1.getName());
		System.out.println(a1.getBook().size());
			
			List<Book> b = a1.getBook();
			System.out.println("==========Book===========");
			for(Book i:b) {
				System.out.println(i.getBid());
				System.out.println(i.getTitle());
				System.out.println("--------------");
			}
			System.out.println("Records");
		} else {
			System.out.println("Records not found");
		}
	}
}
