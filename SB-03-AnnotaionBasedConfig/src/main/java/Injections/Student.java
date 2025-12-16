package Injections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	//Constructor Injection
	
	private String name;
	private String address;
	
	public Student(@Value(value = "Deloitte") String name,@Value(value = "Mumbai") String address) {
		super();
		this.name = name;
		this.address =address;
	}
	
	public void exams() {
		System.out.println("Conducting exams");
	}

	public void display() {
		System.out.println("========College========");
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
