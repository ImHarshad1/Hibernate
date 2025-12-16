package Static_NonStatic;

public class SwimmingPoolNS {
	static String n;
		   int age;
		   
	public  SwimmingPoolNS(){//constructor executes static and non-static 
		age=19;
		}
	static {
		n="Sahil";
		System.out.println("Static 1");
	}
	{
		age=22;
		System.out.println("Non-static 1");
	}

	public static void main(String[] args) {
		
		System.out.println("Start");
		SwimmingPoolNS s1=new SwimmingPoolNS();
		System.out.println(s1.age);
		System.out.println("end");
	}
	static {
		n="Dheeraj";
		System.out.println("Static 2");
	}
	{
		age=20;
		n="Harshad";//n is static, Can make a Non-static reference to the static field age
		System.out.println("Non-static 2");
	}
	static {
		n="Harshad";
//		age=20;  			//Cannot make a static reference to the non-static field age
		System.out.println("Static 3");
	}
}
