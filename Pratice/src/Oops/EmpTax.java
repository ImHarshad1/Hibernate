package Oops;

	class EMPsal{
		private String name;
		private double sal;
		public EMPsal(String name, double sal) {
			this.name = name;
			this.sal = sal;
		}
		public String getname() {
			return name;
		}
		public double getsalTax() {
			return sal*0.9;
		}
		public void Ogsal() {
			System.out.println("Original Salary: "+sal);
		}
	}

public class EmpTax {
	public static void main(String[] args) {
		EMPsal s1=new EMPsal("Amit",50000);
		System.out.println("Employee: "+s1.getname());
		s1.Ogsal();
		System.out.println("Salary after Tax: "+s1.getsalTax());
	}

}
