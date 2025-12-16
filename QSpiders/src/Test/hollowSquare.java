package Test;

import java.util.Scanner;

public class hollowSquare {
	public static void hollowsqr(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void hollowdot(int a) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				if(i==1 || j==1 || i==a || j==a ||
						(i==(a/2)+1 && j==(a/2)+1)) {
						System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	public static void sqrplus(int r) {
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=r; j++) {
				if(i==1 || j==1 || i==r  ||j==r || i==(r/2)+1 || j==(r/2)+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	public static void triangle1(int b) {
		for(int i=1; i<=b; i++) {
			for(int j=1; j<=b; j++) {
				if(j==1 || i==j || i==b) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	static void triangle2(int c) {
		for(int i=1; i<=c; i++) {
			for(int j=1; j<=c; j++) {
				if(i==1 || j==c || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	static void triangle3(int d) {
		for(int i=1; i<=d; i++) {
			for(int j=1; j<=d; j++) {
				if(i==1 || j==1 || i+j==d+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	static void triangle4(int e) {
		for(int i=1; i<=e; i++) {
			for(int j=1; j<=e; j++) {
				if(i==e || j==e || i+j==e+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	public static void pyramid(int f) {
		for(int i=1; i<=f; i++) {
			for(int j=1; j<=f-i; j++) {
				System.out.print("  ");
			}
			for(int h=1; h<=(i*2)-1; h++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	}
	public static void revpyramid(int g) {
		for(int i=6; i<=g-1; i++) {
			for(int j=1; j<=g-i; j++) {
				System.out.print("  ");
			}
			for(int h=1; h<=(2*i)-1; h++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=g; i>=1; i--) {
			for(int j=1; j<=g-i; j++) {
				System.out.print("  ");
			}
			for(int h=1; h<=(2*i)-1; h++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		hollowsqr(n);	
		System.out.println("=================");
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		hollowdot(a);
		
		System.out.println("Enter NUmber: ");
		int r=sc.nextInt();
		sqrplus(r);
		
		System.out.print("Enter Number: ");
		int b=sc.nextInt();
		triangle1(b);
		
		System.out.print("Enter Number: ");
		int c=sc.nextInt();
		triangle2(c);
		
		System.out.println("ENter Number: ");
		int d=sc.nextInt();
		triangle3(d);
		
		System.out.print("ENter Number: ");
		int e=sc.nextInt();
		triangle4(e);
		
		System.out.println("ENter Number: ");
		int f=sc.nextInt();
		pyramid(f);
		
		System.out.println("ENter Number: ");
		int g=sc.nextInt();
		revpyramid(g);
	}
	

}
