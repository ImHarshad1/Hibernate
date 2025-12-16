package AccessSpecifier;

class EmployeeFinal{
		String name;
	final String empid;
		double sal;
	private static int randomnum=900;//static is important, without Numbers are not incrementing ++
	
	public EmployeeFinal(String name, double sal) {
		this.name=name;
		this.empid="2025WIP"+randomnum++;
		this.sal=sal;
	}
	void info() {
		System.out.println("EMP name: "+name+" Empid :"+empid+" Salary is: "+sal);
	}
}
public class Wipro_Final {
	public static void main(String[] args) {
		System.out.println("Start");
		EmployeeFinal e1=new EmployeeFinal("Harshad",85000);
		EmployeeFinal e2=new EmployeeFinal("Vipul",5000);
		EmployeeFinal e3=new EmployeeFinal("Vikas",6000);
		EmployeeFinal e4=new EmployeeFinal("Piyush",75000);
		EmployeeFinal e5=new EmployeeFinal("Pratik",95000);
		
		e1.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		System.out.println("Wipro End");
	}
}
