package Static_NonStatic;

public class TypesOfvariables {
	
	String username;
	String Pass;
	String email;
	
	static String add="Pune";
	//instance method
	void register() {
		//can we access instance variable in instance method?
		//Yes
		System.out.println(username);
		System.out.println(Pass);
		System.out.println(email);
		
		//can we access static variable in instance method?
		//yes
		System.out.println(add);
	}
	//static method
	//Method define using static keyword
	static void count() {
		//can we access instance variable in static method?
		//not directly,but indirectly we can using object
		TypesOfvariables t1=new TypesOfvariables();
		System.out.println(t1.username);
		System.out.println(t1.Pass);
		System.out.println(t1.email);
		
		//can we access static variable in static method?
		//yes
		System.out.println(add);
	}
	
	void m1() {
		register();
		//can we call instance method in another instance method?
		//yes
		
		//can we call static method in another instance method?
		//yes
		count();
	}
	static void m2() {
//		register();//error Cannot make a static reference to the non-static method register() from the type TypesOfvariables
		//can we call instance method in another static method?
		//not directly... but indirectly using object we can call 
		TypesOfvariables t2=new TypesOfvariables();
		t2.register();
		
		//can we call static method in another static method?
		//yes
		count();
	}
	
	public static void main(String[] args) {
		TypesOfvariables v1=new TypesOfvariables();
		v1.register();
		System.out.println("====================");
		v1.count();
		System.out.println("====================");
		v1.m1();
		System.out.println("====================");
		v1.m2();
	}

}
