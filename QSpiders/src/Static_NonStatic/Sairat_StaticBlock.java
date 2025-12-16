package Static_NonStatic;

public class Sairat_StaticBlock {
	static String s;

	static {
		s="Babu";
		System.out.println("Riyaa");
	}
	static {
		s="Sheela";
		System.out.println("Dheeraj");
	}
	public static void main(String[] args) {
		System.out.println("Sairat start");
		System.out.println(s);
		
		System.out.println(Sairat_StaticBlock.s);
		System.out.println("Sairat ENd");
	}
	static {
		s="Munni";
		System.out.println("Riyaa Placed ");
	}
	static {
		s="Munna";
		System.out.println("Dheeraj Sad ");
	}

}
