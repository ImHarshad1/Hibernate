package com.ty.crud;

import java.lang.annotation.ElementType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Employee e = em.find(Employee.class, 102);
		
		if(e != null) {
			System.out.println("=========Employee============");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getSal());
		} else {
			System.out.println("Not Found");
		}
		
	}

}
