package Static_NonStatic;

public class krish1 {

	public static void main(String[] args) {
		System.out.println(jaooo1.i);
		jaooo1.power();
		System.out.println(new jaooo1().j);
		new jaooo1().dhoop();
		
		System.out.println("===================");
		jaooo1 j1=new jaooo1();
		System.out.println(j1.j); //accesing non static variable
		j1.power();
		System.out.println("====================");
		
		System.out.println(bheem1.a);
		System.out.println( bheem1.b);
		bheem1.fighting();
				new bheem1().cricket();
	}
}
