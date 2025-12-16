package pattern;

import java.util.Scanner;

public class Swastik {
	public static void swastik2(int a) {
		for(int i=1; i<=a;i++) {
			for(int j=1; j<=a ;j++){
				if(i==((a/2)+1) || j==((a/2)+1) || 
						((i==1) && j>=((a/2)+1)) || ((i==a) && j<=((a/2)+1)) ||
						((j==1) && i<=((a/2)+1)) || ((j==a) && i>=((a/2)+1)) ||
						i==j || (i+j) == (a+1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		
	}
	public static void swastik(int n) {
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if(r==(n/2)+1 || c==((n/2)+1) ||
					((r==1) && c>=((n /2)+1)) || ((r==n) && c<=((n/2)+1)) ||
					((c==1) && r<=((n/2)+1)) || ((c==n) && r>=((n/2)+1))) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number :");
		int n =sc.nextInt();
		swastik(n);
		System.out.println("==========================");
		System.out.print("Enter a Number :");
		int a=sc.nextInt();
		swastik2(a);
	}	
}
