package OOPs;

public class GoogleEmp {

	public static void main(String[] args) {
		Employee e1=new Employee("Harshad",18,5000);
		System.out.println(e1.getname());
		e1.setname("Harsh");
		System.out.println(e1.getname());
		System.out.println("================");
		Employee e2=new Employee("Vikas",5,9000);
		System.out.println(e2.getname());
		e2.setname("Vipul");
		System.out.println(e2.getname());
		e2.setsal(150);
		System.out.println(e2.getsal());
	}
}
