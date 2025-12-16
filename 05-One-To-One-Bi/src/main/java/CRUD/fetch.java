package CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entity.Car;
import Entity.Engine;

public class fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Engine e = em.find(Engine.class, 4);
		System.out.println("==============Engine==============");
		if(e != null) {
			System.out.println(e.getEid());
			System.out.println(e.getCc());
			
		Car c = e.getCar();
		System.out.println("==============Car=================");
		System.out.println(c.getCid());
		System.out.println(c.getBrand());
		System.out.println("-----------------------------------");
		}
	}

}
