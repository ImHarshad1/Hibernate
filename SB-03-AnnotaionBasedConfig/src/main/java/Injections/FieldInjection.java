package Injections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
	
	@Value(value = "Darshan")
	private String name;
	
	@Value(value = "36")
	private int age;
	
	public void studey() {
		System.out.println("Student is studying");
	}
	
	public void display() {
		System.out.println("==========Student===========");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
