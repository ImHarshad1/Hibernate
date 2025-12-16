package Injections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {

	private String name;
	private int age;
	
	public void play() {
		System.out.println("person is playing game");
	}

	public void display() {
		System.out.println("=======Person========");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
	@Value(value="John")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "37")
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
