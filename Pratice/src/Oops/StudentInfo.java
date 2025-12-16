package Oops;

	class Studentt{
		private String name;
		private int rollno;
		private char grade;
		public Studentt(String name, int rollno, char grade) {
			super();
			this.name = name;
			this.rollno = rollno;
			this.grade = grade;
		}
		
		public String getname() {
			return name;
		}
		public int getrollno() {
			return rollno;
		}
		public char getgrade() {
			return grade;
		}
		public void setgrade(char grade) {
			if(grade=='A' || grade=='B'|| grade=='C' || grade=='D' || grade=='F') {
				this.grade=grade;
			}else {
				System.out.println("Invalid Grade");
			}
		}
	}
public class StudentInfo {
	public static void main(String[] args) {
		Studentt s1=new Studentt("Ramesh",18,'A');
		System.out.println("Student: "+s1.getname()+" (Roll: "+s1.getrollno()+")");
		System.out.println("Grade: "+s1.getgrade());
		s1.setgrade('B');
		System.out.println("Grade: "+s1.getgrade());
		s1.setgrade('Z');
	}

}
