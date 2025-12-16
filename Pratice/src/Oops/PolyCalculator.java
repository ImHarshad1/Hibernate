package Oops;

	class calculatorr{
		public int add(int a,int b) {
			return a+b;
		}
		public double add(double a,double b) {
			return a+b;
		}
		public int add(int a, int b, int c) {
			return a+b+c;
		}
	}

public class PolyCalculator {
	public static void main(String[] args) {
		calculatorr c1=new calculatorr();
		System.out.println("Sum of 2 ints    : "+c1.add(10,20));
		System.out.println("Sum of 2 Doubles : "+c1.add(10, 10));
		System.out.println("Sum of 3 ints    : "+c1.add(10, 10, 10));
	}

}
