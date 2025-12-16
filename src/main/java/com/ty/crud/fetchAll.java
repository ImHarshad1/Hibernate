package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.*;
import com.ty.entity.Employee;

public class fetchAll {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
//		String hql = "select e from Employee e";
//		Query query = em.createQuery(hql);	
		
		// Index based parameter
		String hql ="select e from Employee e where e.name=?1 and e.sal=?2";
		Query query = em.createQuery(hql);
		query.setParameter(1, "John");
		query.setParameter(2, 50000.0);
		
		//Naming based Parameter
//		String hql = "select e from Employee e where e.name=:empName and e.sal=:empSal";
//		Query query = em.createQuery(hql);
//		query.setParameter("empName", "John");
//		query.setParameter("empSal", 50000.0);
		
		List<Employee> e = query.getResultList();
		
		if(e == null || e.isEmpty()) {
			System.out.println("No data matched your query.");
		}else {
		for(Employee emp:e) {
			System.out.println("=========Employee========");
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getEmail());
			System.out.println(emp.getSal());
			}
		}
	}
}
