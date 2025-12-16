package Array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers of elements in the Array");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter "+s+" Numbers");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println("Sum of an Given Array is: "+sum);
		for(int add:arr) {         //here add is variable so it can be anything
			sum=sum +add;
		}
		System.out.println("Sum is: "+sum);
	}
}