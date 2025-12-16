package OOPs;

public class Deloitte_EMP {

	public static void main(String[] args) {
		EMP e1=new EMP("Harshad",1,70000);
		System.out.println(e1.getname());
		e1.setname("Harsh");
		System.out.println(e1.getname());
		e1.setempid(18);
		System.out.println(e1.getempid());
		
		EMP e2=new EMP("Hars",10,90000);
		e2.setname("Harshad");
		e2.setempid(7);
		System.out.println(e2.getname()+"   "+e2.getempid());
	}
}