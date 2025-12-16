package CRUD;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entity.Doctor;
import Entity.Patient;

public class FetchByDoctor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Doctor d = em.find(Doctor.class, 101);
		if(d!=null) {
			System.out.println("===========Doctor===========");
			System.out.println(d.getDid());
			System.out.println(d.getName());
			System.out.println(d.getEmail());
			System.out.println(d.getDegree());
			
			List<Patient> pp =d.getPatients();
			System.out.println("===========Patients===========");
			for(Patient p:pp) {
				System.out.println(p.getPid());
				System.out.println(p.getName());
				System.out.println(p.getDisease());
				System.out.println("--------------------------");
			}
		} else{
			System.out.println("Not Found");
		}
	}
}