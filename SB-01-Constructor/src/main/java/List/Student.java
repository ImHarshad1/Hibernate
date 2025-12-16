package List;

import java.util.List;

public class Student {
	private String name;
	private long phone;
	private List<String> subjects;
	
	public Student(String name, long phone, List<String> subjects) {
		this.name=name;
		this.phone=phone;
		this.subjects=subjects;
	}
	
	public void display() {
		System.out.println("Name     : " + name);
		System.out.println("Phone    : " + phone);
		System.out.println("Sybjects : " + subjects);
	}
	
}
