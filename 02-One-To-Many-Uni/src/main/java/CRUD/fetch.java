package CRUD;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Studnet;

public class fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		College c = em.find(College.class, 102);
		System.out.println("==========College===========");
		if(c!=null) {
		System.out.println(c.getcid());
		System.out.println(c.getName());
		System.out.println(c.getAddress());
		
		List<Studnet> ss = c.getStudent();
		System.out.println("==========Students===========");
		for(Studnet s:ss) {
		System.out.println(s.getsid());
		System.out.println(s.getname());
		System.out.println(s.getstd());
		System.out.println("------------------------------");
			}
		} else {
			System.out.println("Not Found");
		}
	}
}
