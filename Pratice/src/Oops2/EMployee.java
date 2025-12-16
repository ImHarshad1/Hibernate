package Oops2;

	class wipro{
		String name;
  final String empid;
		double sal;  
	private static int randomnum=900;
	wipro(String name, double sal){
		this.name=name;
		this.sal=sal;
		this.empid="WIP#"+randomnum++;
	}
	public void Details() {
		System.out.println("Employee Name : "+name+"  Employee ID : "+empid+" Salary : "+sal);
	}
	}

public class EMployee {
	public static void main(String[] args) {
		wipro w1=new wipro("Harsh",90000);
		w1.Details();
		wipro w2=new wipro("Vimal",50000);
		w2.Details();
		wipro w3=new wipro("Vikas",40000);
		w3.Details();
		wipro w4=new wipro("Bobyy",60000);
		w4.Details();
		wipro w5=new wipro("Jonny",9999999);
		w5.Details();
		
	}

}
