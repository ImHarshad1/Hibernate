package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Studnet;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Studnet s = em.find(Studnet.class, 2);
		if(s!=null) {
			s.setstd("7th");
			
			et.begin();
			em.persist(s);
			et.commit();
			System.out.println("Saved");
		} else {
			System.out.println("Not Saved");
		}
	}

}
