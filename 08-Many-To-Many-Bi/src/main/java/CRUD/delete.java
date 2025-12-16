package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Doctor;
import Entity.Patient;

public class delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d =em.find(Doctor.class, 101);
		Patient p = em.find(Patient.class, 222);
		
		if(d!=null && p!=null) {
//			et.begin();
//			d.getPatients().remove(p);
//			et.commit();
//			
//			et.begin();
//			em.remove(p);
//			et.commit();
			
			et.begin();
			em.remove(p);
			d.getPatients().remove(p);
//			p.getDoctors().remove(d);
			et.commit();
			
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}
	}
}