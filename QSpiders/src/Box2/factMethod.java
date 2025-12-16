package Box2;

import java.util.Scanner;

public class factMethod {
	public static long fact(int n) {
		long sum= 1;
		for(int i=1;i<=n;i++) {
			sum*=i;
			}
			return sum;
		
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		System.out.println("Factorial is ;"+fact(n));
	}
}
//public class FactMethod {
//    public static long fact(int n) {
//        long sum = 1; // Changed to long to handle larger factorials
//        for (int i = 1; i <= n; i++) {
//            sum *= i; // Calculate the factorial
//        }
//        return sum; // Moved return statement outside of the loop
//    }
//    public static void main(String[] args) {
//        System.out.println("Main start");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int n = sc.nextInt();