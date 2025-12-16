package Generalization;

public class Employee extends Person{
	
	String empid;
	double sal;
	String role;
	public Employee(String name, int age, char gen, String empid, double sal, String role) {
		super(name, age, gen);
		this.empid = empid;
		this.sal = sal;
		this.role = role;
	}
	@Override
	void jankari() {
		System.out.println("Employee Name :"+name+"Age "+age+" Gender "+
	gen+"Employee ID "+empid+" Salary "+sal+"Role "+role);
	}
	
}
