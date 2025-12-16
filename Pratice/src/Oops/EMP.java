package Oops;

	abstract class Employee{
		String name;
		
		Employee(String name){
			this.name=name;
		}
		abstract double CalculateSal();
	}
	class FulltimeEmp extends Employee implements BonusEligible{
		double basesal;
		FulltimeEmp(String name,double basesal){
			super(name);
			this.basesal=basesal;
		}
		@Override
		public double CalculateSal() {
			return basesal;
		}
		@Override
		public void givebonus(double percent) {
			double bonus=basesal*(percent/100);
			basesal +=bonus;
		}
	}
	
	class ParttimeEmp extends Employee{
		double hourlyrate;
		int hoursworked;
		
		ParttimeEmp(String name, double hourlyrate, int hoursworked){
			super(name);
			this.hourlyrate=hourlyrate;
			this.hoursworked=hoursworked;
		}
		@Override
		double CalculateSal() {
			return hourlyrate*hoursworked;
		}
	}
	
public class EMP {
	public static void main(String[] args) {
		FulltimeEmp f1=new FulltimeEmp("Alice",50000);
		ParttimeEmp p1=new ParttimeEmp("Bob",250,100);
		
		System.out.println("Full-time Employee Salary: "+f1.CalculateSal());
		f1.givebonus(10);//10% bonus
		System.out.println("After Bonus : "+f1.CalculateSal());
		
		System.out.println("Part-time Employee Salary: "+p1.CalculateSal());
	}

}
