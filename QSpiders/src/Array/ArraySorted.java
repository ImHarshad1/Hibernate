package Array;

import java.util.Scanner;

public class ArraySorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in an Array");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Elements Are :"+s);
			for(int i=0; i<arr.length;i++) {
				 arr[i]=sc.nextInt();
			}
		
//		int[] arr= {1,2,3,4};
		boolean sorted=true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
			}
		}
		if(sorted) {
			System.out.println("Array is Sorted");
		}else {
			System.out.println("Array is not Sorted");
		}
		
	}

}
