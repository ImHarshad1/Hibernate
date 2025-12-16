package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Student;

public class delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College c = em.find(College.class, 101);
		Student s = em.find(Student.class, 222);
		
		if(c!=null && s!=null) {
			
			et.begin();
			c.getStudent().remove(s);
			et.commit();
			
			et.begin();
			em.remove(s);
			et.commit();
			
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}

	}

}
