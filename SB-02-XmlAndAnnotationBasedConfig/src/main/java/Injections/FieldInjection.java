package Injections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
	
	@Value(value = "Allen")
	private String name;
	
	@Value(value = "allen123@gmail.com")
	private String email;
		
	public void studey() {
		System.out.println("Student is studying");
	}
	
	public void display() {
		System.out.println("==========Student===========");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
	}
}