package ManyToOne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetc {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d = em.find(Doctor.class, 1);
		et.begin();
		d.setName("Johnnn");
		em.persist(d);
		et.commit();
		
		System.out.println("=============Doctor===========");
//		if(d!=null) {
//			System.out.println(d.getDid());
//			System.out.println(d.getName());
//	
//			List<Patient> p = d.getPatient();
//			System.out.println("=========Patient=========");
//			for(Patient i:p) {
//				System.out.println(i.getPid());
//				System.out.println(i.getDisease());
//				System.out.println("-----------------------");
//			}
//			System.out.println("Fetched");
//		} else {
//			System.out.println("Not Found");
//		}
//
	}

}
