package Test;

import java.util.Scanner;

public class tp {
	public static void diamond(int r) {
//		int rn=0;
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=r-i; j++) {
					System.out.print("  ");
			}
				for(int k=1; k<=(2*i)-1; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}
//	for(int i=1; i<=h; i++) {
//		for(int j=1; j<=h-i; j++) {
//			System.out.print("  ");
//		}for(int k=1; k<=(2*i)-1;k++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
	public static int evenodd(int c) {
		int sum=0;
			if(c%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("Number is Odd");
		}
		return sum;
	}
	public static long fact(int a) {
		a=5;
		int sum=1;
		for(int i=1;i<=a;i++) {
			sum*=i;
		}
		return sum;
	}
	public static long sum(int b) {
		int sum=0;
		for(int i=0; i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
	public static boolean prime(int n) {
		int z=0;
		if(n<2) {
			return false;
		}
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Factorial is "+fact(5));
//		System.out.println("+========================");
//		System.out.println("Sum IS: "+sum(6));
//		System.out.println("=========================");
//		
//		System.out.print("Enter a Number :");
//		int a=sc.nextInt();
//		if(prime(a)) {
//			System.out.println("Given Number Is Prime "+a);
//		}
//		else {
//			System.out.println(a+" is not Prime");
//		
//	}
//		System.out.println("=======================");
//		int c=sc.nextInt();
//		System.out.println(evenodd(c));
//		System.out.println("=======================");
		
		System.out.print("Enter number ");
		int r=sc.nextInt();
		diamond(r);
	}
}