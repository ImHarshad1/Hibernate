package AccessSpecifier;

public class Conjuring1 {
		
	public  int a=100;
	protected int b=200;
			  int c=300;
	private int d=400;
	
	public void demo1() {
		System.out.println("1..Public access method");
	}
	protected void demo2() {
		System.out.println("2..Protected access method");
	}
	 void demo3() {
		System.out.println("3..default/pkg.level access method");
	}
	private void demo4() {
		System.out.println("4..Private access method");
	}
	public static void main(String[] args) {
		System.out.println("start");
		
		Conjuring1 c1=new Conjuring1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		
		c1.demo1();
		c1.demo2();
		c1.demo3();
		c1.demo4();
		System.out.println("End");
	}
	}
