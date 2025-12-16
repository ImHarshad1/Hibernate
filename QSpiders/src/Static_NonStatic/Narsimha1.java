package Static_NonStatic;

import AccessSpecifier.Conjuring1;
	
//Different class Different Package
public class Narsimha1 {
	public static void main(String[] args) {
		System.out.println("Narsimha Start");
		Conjuring1 c1=new Conjuring1();
		System.out.println(c1.a);  //only Public is Accessed 
//		System.out.println(c1.b);
//		System.out.println(c1.c);   //CTE
//		System.out.println(c1.d);
		
		c1.demo1();				   //only Public is Accessed 
//		c1.demo2();
//		c1.demo3(); 				CTE
//		c1.demo4();
	}

}
