package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.userInfo;

public class save {
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	userInfo u1 =new userInfo();
	u1.setName("Johnny");
	u1.setemail("Jsins123@gmail.com");
	
	et.begin();
	em.persist(u1);
	et.commit();
	System.out.println("Saved");
	
	}
}
