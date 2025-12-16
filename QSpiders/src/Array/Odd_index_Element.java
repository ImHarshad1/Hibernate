package Array;

import java.util.Scanner;

public class Odd_index_Element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Elements In an Array are: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Elements are: "+s);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
//		int arr[]= {2,3,4,5,6,7,9,8};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {
				sum+=arr[i];
			}
		}System.out.println(sum);
	}
}
