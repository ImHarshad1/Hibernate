package Array;

import java.util.Scanner;

public class NumberOccurance {

	public static void main(String[] args) {
		int[] arr= {1,1,3,3,3,3,3,3,3,1,2,3,2,3,2,3,1};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int key=sc.nextInt();
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		System.out.println(key+" has occured - " +count+ " times");
	}

}
