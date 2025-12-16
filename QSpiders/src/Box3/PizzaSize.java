package Box3;
import java.util.Scanner;
public class PizzaSize {
	 public static double area(double r) {
		 double s=3.14*r*r;
		 return s;
	 }
	public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Pizza");
		int num=sc.nextInt();	
		double s = area(num);
		System.out.println("Area Of "+num+"inch pizza is " + s );
		
		if(s>0 && s<=100) {
			System.out.println("Small size Pizza");
		}
		else if(s>100 && s<=250) {
			System.out.println("Medium Size Pizaa");
		}
		else if (s>250) {
			System.out.println("Large Size Pizza");
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Main ");
}
}
