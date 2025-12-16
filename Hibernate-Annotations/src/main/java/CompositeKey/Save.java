package CompositeKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		EmployeeId e1 = new EmployeeId();
		e1.setEmail("dynamo@gmail.com");
		e1.setPhone(987339343);
		
		Employee e = new Employee();
		e.setEid(e1);   
		e.setName("Dynooo");
		
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Saved");
	}

}
