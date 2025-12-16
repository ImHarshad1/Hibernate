package List;

import java.util.List;

public class Student {
	private String name;
	private long phone;
	private List<String> subjects;
	
	
	public void display() {
		System.out.println("Name     : " + name);
		System.out.println("Phone    : " + phone);
		System.out.println("Sybjects : " + subjects);
	}
	
	public void setSubjects(List<String> subjects){
		this.subjects=subjects;
	}
	public List<String> getSubjects(){
		return subjects;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
}
