package Test;

import java.util.Scanner;

public class All {
	public static long sum(int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static long fact(int a) {
		int ans=1;
		for(int i=1; i<=a; i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static boolean prime(int b) {
		if(b<2){
		return false;
	}
		for(int i=2;i<=Math.sqrt(b);i++) {
			if(b%2==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void square(int d) {
		for(int r=1; r<=d; r++) {
			for(int c=1; c<=d; c++){
				if(r==1 || c==1 || r==d || c==d) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	
	public static void pyramid(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h-i; j++) {
				System.out.print("  ");
			}for(int k=1; k<=(2*i)-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void diamond(int p) {
		for(int i=6; i<=p; i++) {
			for(int j=1; j<=p-i; j++) {
				System.out.print("  ");
			}for(int k=1; k<=(2*i)-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=p-1; i>=1; i--) {
			for(int j=1; j<=p-i; j++) {
				System.out.print("  ");
			}for(int k=1; k<=(2*i)-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a number :");
	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum is: "+sum(n));
		
		System.out.print("Enter a Number :");
		int a= sc.nextInt();
		System.out.println("Factorial Is "+fact(a));
		
		System.out.print("Enter a NUmber :");
		int b=sc.nextInt();
		if(prime(b)) {
			System.out.println("Is Prime");
		}else {
			System.out.println("Is not Prime");
		}
		
		System.out.print("Enter No");
		int d=sc.nextInt();
		square(d);
		
		System.out.print("Enter NO");
		int h=sc.nextInt();
		pyramid(n);
		
		System.out.print("Enter a Number :");
		int p=sc.nextInt();
		System.out.println();
		diamond(p);
	}
}