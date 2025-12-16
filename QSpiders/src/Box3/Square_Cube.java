package Box3;

public class Square_Cube {
	public static void square(double n){
		System.out.println("square Start");
		System.out.println("Square is "+n*n);
		System.out.println("square end");
	}
	public static void Cube(double a) {
		System.out.println("Cube Start");
		System.out.println("Cube is "+a*a*a);
		System.out.println("Cube end");
	}
	public static void main(String[] args) {
		
		Cube(3);
		square(3);
	
	}

}
