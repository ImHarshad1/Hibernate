package CRUD;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Doctor;
import Entity.Patient;

public class save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Doctor d = new Doctor();
		d.setDid(101);
		d.setName("Stark");
		d.setEmail("stark@gmail.com");
		d.setDegree("MBBS");
		
		Doctor d1 = new Doctor();
		d1.setDid(102);
		d1.setName("Captain");
		d1.setEmail("Captain@gmail.com");
		d1.setDegree("BMS");

		Patient p1 = new Patient();
		p1.setPid(111);
		p1.setName("A");
		p1.setDisease("Cold");

		Patient p2 = new Patient();
		p2.setPid(222);
		p2.setName("B");
		p2.setDisease("Fever");

		Patient p3 = new Patient();
		p3.setPid(333);
		p3.setName("C");
		p3.setDisease("Headache");
		
		Patient p4 = new Patient();
		p4.setPid(444);
		p4.setName("d");
		p4.setDisease("Sardiiiiiiiii");
		
		d.setPatients(Arrays.asList(p1,p2));
		d1.setPatients(Arrays.asList(p3,p3));
		
		et.begin();
		em.persist(d);
		em.persist(d1);
		em.persist(p4);
		em.persist(p3);
		em.persist(p2);
		em.persist(p1);
		et.commit();
		System.out.println("Saved");
	}
}
