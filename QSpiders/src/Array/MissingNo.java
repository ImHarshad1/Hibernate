package Array;

import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in an Array");
		int s=sc.nextInt();
		int arr[]= new int[s];
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		int arr[] = {2,3,4,5};
		int sum1=0;
		for(int i=0; i<arr.length; i++){
			sum1+=arr[i];
			}
		int sum2=0;
		System.out.println("Enter Last Element of an Array");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum2+=i;
		}
		System.out.println("Missing Element is :"+(sum2-sum1));
	}
}
