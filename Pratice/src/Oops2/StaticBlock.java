package Oops2;

public class StaticBlock {
	static String s;
	static {
		s="Babuuu";
//		System.out.println("Static Block 1");
	}
	static {
		s="Shona";
//		System.out.println("Static Block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
//		StaticBlock b1=new StaticBlock();
//		System.out.println(b1.s);
		System.out.println(StaticBlock.s);
	}
	static {
		s="Monaa";
//		System.out.println("Static Block 3");
	}
	static {
		s="Baby";
//		System.out.println("Static Block 4");
	}

}
