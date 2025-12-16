package CacheMemory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em1 = emf.createEntityManager();
		System.out.println("===========em1==============");
		
		userTable u1 = em1.find(userTable.class, 1);
		System.out.println(u1);
				
		System.out.println("--------------------------------------------");
	
		userTable u2 = em1.find(userTable.class,2);
		System.out.println(u2);
		
		System.out.println("--------------------------------------------");
		
		userTable u3 = em1.find(userTable.class, 1);
		System.out.println(u3);
		
		System.out.println("--------------------------------------------");
		
		userTable u4 =em1.find(userTable.class, 2);
		System.out.println(u4);
		
		EntityManager em2 = emf.createEntityManager();
		System.out.println("===========em2==============");
		
		userTable us1 = em2.find(userTable.class, 1);
		System.out.println(us1);
		
		System.out.println("--------------------------------------------");
		
		userTable us2 = em2.find(userTable.class, 2);
		System.out.println(us2);
		
		System.out.println("--------------------------------------------");
		
		userTable us3 = em2.find(userTable.class, 1);
		System.out.println(us3);
		
		userTable us4 = em2.find(userTable.class, 2);
		System.out.println(u4);
	}
	

}
