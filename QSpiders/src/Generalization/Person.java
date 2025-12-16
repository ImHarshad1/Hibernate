package Generalization;

public class Person {
	
		String name;
		int age;
		char gen;	

	public Person(String name, int age, char gen) {
		this.name=name;
		this.age=age;
		this.gen=gen;
	}
	
	void jankari() {
		System.out.println("Name :"+name+"Age :"+age+"Gender is :"+gen);
	}

}
