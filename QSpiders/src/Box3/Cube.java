package Box3;
import java.util.Scanner;

public class Cube {
	public static double cube(double a,double b,double c) {
		double ans= (a*b*c);
		return ans;
	}
	public static double sphere(double d,double e) {
		double ans=(4*3.14*d*e);
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st vale ");
		int a=sc.nextInt();
		System.out.println("Enter 2st vale ");
		int b=sc.nextInt();
		System.out.println("Enter 3st vale ");
		int c=sc.nextInt();
		System.out.println("Area Of Cube is "+cube(a,b,c));
		
		System.out.println("Enter 1st vale ");
		int d=sc.nextInt();
		System.out.println("Enter 2st vale ");
		int e=sc.nextInt();
		System.out.println("Area Of Sphere is "+ sphere(d,e));

	}
}