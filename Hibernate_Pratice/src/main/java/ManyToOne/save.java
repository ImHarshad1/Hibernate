package ManyToOne;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d = new Doctor();
		d.setName("Jonny");
		
		Patient p1 = new Patient();
		p1.setDisease("AIDS");
		
		Patient p2 = new Patient();
		p2.setDisease("Attack");
		
		Patient p3 = new Patient();
		p3.setDisease("HIV");
		
		d.setPatient(Arrays.asList(p1,p2,p3));
		
		et.begin();
		em.persist(d);
		et.commit();
		System.out.println("SAved");
		
	}

}
