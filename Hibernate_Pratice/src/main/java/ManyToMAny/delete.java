package ManyToMAny;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		studentt s = em.find(studentt.class, 1);
		coursee c = em.find(coursee.class, 4);
		
		if(c!=null) {
			et.begin();
			em.remove(c);
			s.getCourse().remove(c);
			et.commit();
			System.out.println("Delected");
		}else{
			System.out.println("Not Found");
		}
	}

}
