package CRUD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Studnet;


public class save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College c = new College();
		c.setcid(102);
		c.setName("G.V.K.V");
		c.setAddress("Shahapur");
		
		Studnet s1 = new Studnet();
		s1.setSid(11);
		s1.setname("Ganpat");
		s1.setstd("10th");
		
		Studnet s2 = new Studnet();
		s2.setSid(22);
		s2.setname("Baburao");
		s2.setstd("7th");
		
		Studnet s3 = new Studnet();
		s3.setSid(33);
		s3.setname("Shyam");
		s3.setstd("12th");
		
//		List<Studnet> s = new ArrayList<Studnet>();
//		s.add(s1);
//		s.add(s2);
//		s.add(s3);
		
		c.setStudent(Arrays.asList(s1,s2,s3));
		
		et.begin();
		em.persist(c);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
		
		System.out.println("saved");
	}

}
