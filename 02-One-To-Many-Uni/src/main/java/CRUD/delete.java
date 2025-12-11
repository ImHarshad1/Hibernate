package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Studnet;

public class delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Studnet s3 = em.find(Studnet.class, 03);
		College c = em.find(College.class, 102);
//		
//		if(s3!=null && c!=null) {
//		// 1. Remove child from parent's list
//		et.begin();
//		c.getStudent().remove(s3);
//		et.commit();
//		
//		 // 2. Delete child record
//		et.begin();
//		em.remove(s3);
//		et.commit();
//		System.out.println("Delected");
//		} else {
//			System.out.println("Not Found");
//		}
		
		et.begin();
		em.remove(c);
		et.commit();
		
		
		Studnet s1 = em.find(Studnet.class, 11);
		
//		if(s1!=null) {
//			et.begin();
//			em.remove(s1);
//			c.getStudent().remove(s1);
//			et.commit();
			System.out.println("Deleted");
//		} else {
//			System.out.println("Not Found");
//		}
	}
}