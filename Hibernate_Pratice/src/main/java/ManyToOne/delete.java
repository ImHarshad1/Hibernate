package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d = em.find(Doctor.class, 1);
		Patient p = em.find(Patient.class, 3);
		
		et.begin();
//		em.remove(p);
		d.getPatient().remove(p);
		em.persist(p);
		et.commit();
		System.out.println("Delected");

	}
}
