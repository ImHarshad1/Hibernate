package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.userInfo;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		userInfo u = em.find(userInfo.class, 1);
		
		et.begin();
		u.setemail("JonnyBhai69@gmail.com");
		et.commit();
		System.out.println("Saved");
		
	}
}
