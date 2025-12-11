package ManyToManyCRUD;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToManyEntity.Doctor;
import ManyToManyEntity.Patient;

public class delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d =em.find(Doctor.class, 101);
		if(d!=null) {
			List<Patient> pList =d.getPatients();
			Patient removePatient = null;
			
			for(Patient p:pList) {
				if(p.getPid()==333) {
					removePatient=p;
					break;
				}
			}
			
			if(removePatient!=null) {
				et.begin();
				pList.remove(removePatient);  // remove link first
				em.merge(d);					// update join table (Not Necessary to merge)
				em.remove(em.find(Patient.class, removePatient.getPid()));   // delete record
				et.commit();
			System.out.println("Saved");	
			}
		}	
	}
}