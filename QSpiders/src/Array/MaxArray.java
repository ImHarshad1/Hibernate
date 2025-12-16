package Array;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
//		int[] arr= {10,20,30,23,45,99,60,78,40,18};
//		int max=arr[0];
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}

//		}System.out.println(max);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number :");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter "+s+" Numbers");
		for(int j=0; j<arr.length; j++) {
//			System.out.print("Enter "+j+" Number ");
			 arr[j]=sc.nextInt();
		}
//		int arr[]= {92,24,55,64,87,64,22,50,90,69};
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
	}
}
