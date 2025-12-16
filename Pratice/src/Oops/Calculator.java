package Oops;

	class Calsi{
		void add(int a, int b) {
			System.out.println(a+b);
		}
//		int add(int a, int b) {
//			return a+b;
//		}
		int add(int a, int b, int c) {
			return a+b+c;
		}
		double add(double a, double b) {
			return a+b;
		}
	}

public class Calculator {

	public static void main(String[] args) {
		Calsi c1=new Calsi();
		c1.add(7, 8);
//		int sum=c1.add(7,8 );
//		System.out.println("Sum of 2 ints    : "+sum);
		int sum2=c1.add(10, 10,10);
		System.out.println("Sum of 3 ints    : "+sum2);
		double sum3=c1.add(3.5, 4.5);
		System.out.println("Sum of 2 Dounble : "+sum3);
	}

}
