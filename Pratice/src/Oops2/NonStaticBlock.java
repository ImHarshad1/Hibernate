package Oops2;

public class NonStaticBlock {
	static String name;
		   int age;
		   
	public NonStaticBlock() {
			age=40;
			System.out.println("Inside Constructor");
		}
	static {
		name="Vimal";
		System.out.println("Static Block 1");
	}
	{
		age=30;
		System.out.println("Non-Static Block 2");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		NonStaticBlock n1=new NonStaticBlock();
		System.out.println(n1.age);
		System.out.println("=================");
		NonStaticBlock n2=new NonStaticBlock();
		System.out.println(n2.age);
		System.out.println("=================");
		System.out.println("End");
	}
	static{
		name="Genduu";
		System.out.println("Static Block 3");
	}

}
