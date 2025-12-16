package CRUD;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entity.College;
import Entity.Student;

public class FetchByCollege {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		College c = em.find(College.class, 101);

		if(c!=null) {
			System.out.println("=======College=======");
			System.out.println(c.getcid());
			System.out.println(c.getName());
			System.out.println(c.getAddress());
			
			List<Student> s =c.getStudent();
			System.out.println("=======Student=======");
			for(Student ss:s) {
					System.out.println(ss.getsid());
					System.out.println(ss.getname());
					System.out.println(ss.getstd());
					System.out.println("------------------------------");
			}
		} else {		
			System.out.println("Not Found");
		}
	}
}
