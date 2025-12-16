package OneToMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class crud1 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Author a = new Author();
		a.setName("Richchardd");
		
		Book b1 = new Book();
		b1.setTitle("Rich Dad Poor Dadd");
		
		Book b2 = new Book();
		b2.setTitle("Now you see mee");
		
		a.setBook(Arrays.asList(b1,b2));

		et.begin();
		em.persist(a);
//		em.persist(b1);
//		em.persist(b2);
		et.commit();
		System.out.println("Record Saved");
			
//		Author a1 = em.find(Author.class, 1);
//		System.out.println("==========Author===========");
//		if(a1!=null) {
//		System.out.println(a1.getAid());
//		System.out.println(a1.getName());
//		System.out.println(a1.getBook().size());
//		
//		List<Book> b = a1.getBook();
//		System.out.println("==========Book===========");
//		for(Book i:b) {
//			System.out.println(i.getBid());
//			System.out.println(i.getTitle());
//		}
//	
//		System.out.println("Fetched Successfully");
//		} else {
//			System.out.println("Not Found");
//		}
	}
}