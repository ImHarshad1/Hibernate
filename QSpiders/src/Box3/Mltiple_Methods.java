package Box3;
import java.util.Scanner;
public class Mltiple_Methods {
	public static double percentage(double a,double b, double c,double d,double e) {
		double ans=((a+b+c+d+e)/500)*100;
		return ans;
	}
	public static double triangle(double f, double g) {
		double area=(0.5*f*g);
		return area;
	}
	public static boolean pythagoras(double hy, double si, double ba) {
		double hyp = hy*hy;
		double are = (si*si)+(ba*ba);
		return hyp == are;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Java Marks :");
		double a = sc.nextDouble();
		System.out.print("Enter DSA Marks :");
		double b = sc.nextDouble();
		System.out.print("Enter HTML Marks :");
		double c = sc.nextDouble();
		System.out.print("Enter CSS Marks :");
		double d = sc.nextDouble();
		System.out.print("Enter SQL Marks :");
		double e = sc.nextDouble();
		System.out.println("Average is :"+ percentage(a,b,c,d,e));
		
		System.out.println("______________________________________");
		
		System.out.print("Enter Base :");
		double f = sc.nextDouble();
		System.out.print("Enter Height :");
		double g = sc.nextDouble();
		System.out.println("Area of Triangle is :"+triangle(f,g));
		
		System.out.println("------------------------------------");
		
		System.out.print("Enter Hypotenuse value :");
		double hy = sc.nextDouble();
		System.out.print("Enter Base Value :");
		double ba = sc.nextDouble();
		System.out.print("Enter Sidde value :");
		double si = sc.nextDouble();
		if(pythagoras(hy,ba,si)) {
			System.out.println("GIve Triangle is Pythagoras");
		}
		else {
			System.out.println("Give Triangle is not Pythagoras");
		}
		
 	}
	

}
