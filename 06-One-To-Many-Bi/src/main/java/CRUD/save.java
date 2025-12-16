package CRUD;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Student;



public class save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College c = new College();
		c.setcid(101);
		c.setName("X");
		c.setAddress("Thane");
		
		Student s1 = new Student();
		s1.setSid(111);
		s1.setname("A");
		s1.setstd("11th");
		s1.setCollege(c);

		Student s2 = new Student();
		s2.setSid(222);
		s2.setname("B");
		s2.setstd("11th");
		s2.setCollege(c);

		Student s3 = new Student();
		s3.setSid(333);
		s3.setname("C");
		s3.setstd("12th");
		s3.setCollege(c);
		
		et.begin();
		em.persist(c);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
		
		System.out.println("saved");
	}

}
