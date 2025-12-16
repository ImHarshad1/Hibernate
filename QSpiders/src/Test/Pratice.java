package Test;

import java.util.Scanner;

public class Pratice {
	public static boolean prime(long d) {
		if(d<2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(d); i++) {
			if(d%2==0) {
				return false;
			}
		}
		return true;
	}
	public static int evenodd(int c) {
		int sum=0;
			if(c%2==0) {
				System.out.println("Given Number is Even");
			}else{
				System.out.println("Given Number is Odd");
		}
		return sum;
	}
	public static long Fact(int b) {
		int sum=1;
		for(int i=1;i<=b; i++) {
			sum*=i;
		}
		return sum;
	}
	public static long sum1(int a) {
			int sum=0;
			for(int i=0; i<=a; i++){
				sum+=i;
			}
			return sum;
		}
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
//		System.out.print("Enter Number: ");
//		int a=sc.nextInt();
//		System.out.println("Sum of N Natural Number is: "+sum1(a));
//		
//		System.out.print("Enter NUmber: ");
//		int b=sc.nextInt();
//		System.out.println("Facorial is: "+Fact(b));
//		
//		System.out.println("Enter a Number");
//		int c=sc.nextInt();
//		evenodd(c);
		
		System.out.print("Enter a Number: ");
		long d=sc.nextInt();
		if(prime(d)) {
			System.out.println("is Prime");
		}else {
			System.out.println("is not Prime");
		}
		System.out.print("Prime Numbers are: ")
		;for(int i=1; i<=10;i++) {
			if(prime(i)) {
				System.out.println("");
				System.out.println(i);
			}
		}
	}
}