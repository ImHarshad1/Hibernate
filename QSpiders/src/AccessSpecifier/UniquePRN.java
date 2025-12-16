package AccessSpecifier;
	
 	class Student{
	String name;
	final String prn;
	private static int randomnum=1;
	//Harshad
 	public Student(String name) {
 		this.name=name;
 		this.prn="20212870"+randomnum++;
 	}
 	public void info() {
 		System.out.println("Nmae is: "+name+" & "+" PRN :"+prn);
 	}
 	}
public class UniquePRN {
	public static void main(String[] args) {
		Student s1=new Student("Harshad");
		Student s2=new Student("Piyush");
		Student s3=new Student("Vipul");
		Student s4=new Student("Vikas");
		Student s5=new Student("Pratik");		
		
		s1.info();
		s2.info();
		s3.info();
		s4.info();
		s5.info();
		
	}
}

