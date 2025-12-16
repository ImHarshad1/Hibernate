package Oops2;

	class Student{
		private String name;
		private int rollno;
		private double marks;
		public Student(String name, int id, double marks) {
			super();
			this.name = name;
			this.rollno = id;
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public int getrollno() {
			return rollno;
		}
		public double getMarks() {
			return marks;
		}
		
		public String getGrade() {
			if (marks >=90) return "A";
			else if (marks >=75) return "B";
			else if (marks >=50) return "C";
			else return "F";
		}
	}

public class StudentReport {
	public static void main(String[] args) {
		Student s1=new Student("Ronny",12,71);
		System.out.println("Name    : "+s1.getName());
		System.out.println("Roll NO : "+s1.getrollno());
		System.out.println("MArks   : "+s1.getMarks());
		System.out.println("Grade   : "+s1.getGrade());
	}

}
