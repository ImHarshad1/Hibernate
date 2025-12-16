package Array;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Elements in an Arry");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Elements are: "+s);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//1st way Easy.		

		System.out.print("Reverse Array Is: ");//This print Output in one line
			for(int i=arr.length-1;i>=0;i--) {
				
				System.out.print(arr[i]+"");
		if(i>0) {
			System.out.print(", ");// Add a comma after each element except the last one
		}
			}
		//2nd way Medium.
//		int arr[]= {1,2,3,4,5};
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+ " ");
//			}
//		int i=0, j=arr.length-1;
//
//		while(i<j) {
//		int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] =temp;
//			i++;
//			j--;
//			
//		}
//		System.out.println();
//		for(int k=0;k<arr.length;k++) {
//			System.out.print(arr[k]+ " ");
//			}	
		

		}
}