package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class student{
	private int rollno;
	private String name;
	
	public student(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	public int getrollno() {
		return rollno;
	}
	public String getname() {
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof student)) return false;
		
		student other =(student) o;
		return this.rollno==other.rollno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public String toString() {
		return "Student{" + rollno + "," +name + "}";
	}
}

public class D6Q2 {

	public static void main(String[] args) {
		 Map<student, Integer> h = new HashMap<>();
		 
		 student s1=new student(101, "Virat");
		 student s2=new student(102, "Rohit");
		 student s3=new student(101, "Jasprith"); //same rollno as s1;
		 
		 h.put(s1, 85);
		 h.put(s2, 90);
		 //because equals/hashcode use rollno. this shouldupdate the vale of roll 101
		 h.put(s3, 95);
		 
		 for(Map.Entry<student, Integer> i:h.entrySet()) {
			 System.out.println(i.getKey() + " --> " + i.getValue());
		 }
	}

}
