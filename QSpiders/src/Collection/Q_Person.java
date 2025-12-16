package Collection;

public class Q_Person {

		String name;
		int age;
		char gen;
		String dob;	
		
		 public Q_Person(String name, int age, char gen, String dob) {
			this.name=name;
			this.age=age;
			this.gen=gen;
			this.dob=dob;
	}
		 @Override
		 public String toString() {
			 return "Name : "+name + " Age : " + age + " Gender : " + gen + " DOB : " + dob;
		 }
}
