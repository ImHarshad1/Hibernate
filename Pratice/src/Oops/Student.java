package Oops;

public class Student {
	String name;
	int rollno;
	double marks;
	
	public Student(String name, int rollno, double marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}

	String CalculateGrade() {
		//2nd way using Ternery Operator
//		return (marks >= 95) ? "A+" :
//			   (marks >=90-94) ? "A" :	
//			   (marks >= 75) ? "B" :
//			   (marks >= 50) ? "C" : "Fail";
		
		if(marks >= 95) return "A+";
		else if(marks >= 90-94) return "A";
		else if(marks >=75) return "B";
		else if(marks >=50) return "C";
		else return "Fail";
	}
	 public void display() {
		System.out.println("Name     : "+name);
		System.out.println("Roll No  : "+rollno);
		System.out.println("Marks    : "+marks);
		System.out.println("Grade    : "+CalculateGrade());
	 }
	
	public static void main(String[] args) {
		Student s1=new Student("Ramesh",101,92);
		s1.display();
	}

}
