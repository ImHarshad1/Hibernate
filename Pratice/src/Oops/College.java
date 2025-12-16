package Oops;

	class person{
		String name;
		int age;
		
		person(String name, int age){
			System.out.println("Person Constructor called");
			this.name=name;
			this.age=age;
		}
	}
	
	class student extends person{
		int rollno;
		
		student(String name, int age, int rollno){
			super(name,age);
			System.out.println("Student Consturctor called");
			this.rollno=rollno;
		}
		student(int rollno){
			super("DefaultName",18);
			System.out.println("Student Constructor called(with rollno only)");
			this.rollno=rollno;
		}
		student(String name){
			super(name,18);
			System.out.println("Student Constructor called (with name only)");
			this.rollno=999;
		}
		
		public void display() {
			System.out.println("Name    : "+name);
			System.out.println("Age     : "+age);
			System.out.println("Roll NO : "+rollno);
		}
	}
	
public class College {

	public static void main(String[] args) {
		student s1=new student("Harshad",22,18);
		s1.display();
		System.out.println("====================");
		student s2=new student(202);
		s2.display();
		System.out.println("====================");
		student s3=new student("Harsh");
		s3.display();
	}
}
