package Injections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

	private String name;
	private String address;
		
	public ConstructorInjection(@Value(value = "Cognnizant") String name,@Value(value = "Pune") String address) {
		super();
		this.name = name;
		this.address = address;
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
