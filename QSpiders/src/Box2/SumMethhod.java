package Box2;

import java.util.Scanner;

public class SumMethhod {
public static long sum(int n) {
	long sum=0;
	for(int i=0; i<n; i++) {
		sum+=i;
	}
	return sum;

}
	public static void main(String[] args) {
		System.out.print("Enter A Number: ");
		Scanner sc = new Scanner(System.in);		
		int n=sc.nextInt();
		System.out.println("Sum is: "+sum(n));
}
	}