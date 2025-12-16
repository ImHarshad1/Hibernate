package AccessSpecifier;

public class Annabella1 {
	
	//Different class same package
	public static void main(String[] args) {
		System.out.println("Annabella1 Start");
		
		Conjuring1 c1=new Conjuring1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
//		System.out.println(c1.d); //CTE Private
		
		c1.demo1();
		c1.demo2();
		c1.demo3();
//		c1.demo4(); //CTE Private
		}

}
