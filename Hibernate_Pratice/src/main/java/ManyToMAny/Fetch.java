package ManyToMAny;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
		
		studentt s = em.find(studentt.class, 1);
		System.out.println("============Student=============");
		if(s!=null) {
			System.out.println(s.getSid());
			System.out.println(s.getName());
			
			List<coursee> cc = s.getCourse();
			System.out.println("==========Course============");
			for(coursee i:cc) {
				System.out.println(i.getCid());
				System.out.println(i.getTitle());
				System.out.println("--------------------------");
			}
			System.out.println("Fetched Succesfully");
		} else{
				System.out.println("Not Found ");
		}
	}
}