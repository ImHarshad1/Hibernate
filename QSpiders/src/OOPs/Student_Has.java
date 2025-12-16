package OOPs;

public class Student_Has {
	int id; 
	String name;
	String email;
	
	Has_Course course;
	
	

	public Student_Has(int id, String name, String email, Has_Course course) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}
	void display() {
		System.out.println("ID    		: "+id);
		System.out.println("Name  		: "+name);
		System.out.println("Email 		: "+email);
		course.displycourse();
	}

	public static void main(String[] args) {
		
		Has_Course c1=new Has_Course("Java",8000,"6 Months");
		
		Student_Has s1=new Student_Has(1,"Harshad","harshad@gmail.com",c1);
		s1.display();
	}

}
