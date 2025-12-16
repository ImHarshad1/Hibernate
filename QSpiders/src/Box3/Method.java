package Box3;

public class Method {
	
	static void motu(double a, double b ,double c) {
		System.out.println("Motu Start");
		System.out.println("Average is" + ((a+b+b)/3));
		System.out.println("Main End");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		motu(40,40,10);
		System.out.println("Main End");

	}

}
