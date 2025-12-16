package Array;

import java.util.Scanner;

public class Even_Elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in an Array: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Elements Are  "+s);
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		int arr[]= {12,11,23,44,66,45,33};
		String even="";
		String odd="";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {	
				even+=arr[i] +" ";
			}else if(arr[i]%2!=0) {		
				odd+=arr[i]+" ";
			}	
			}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		
		//Enhanced For loop
//		System.out.print("Even: ");
//		for(int num:arr) {
//			if(num%2==0) {
//				System.out.print(num +" ");
//			} 
//		}
//		System.out.println();
//		System.out.print("Odd: ");
//		for(int num:arr) {
//			if(num%2!=0) {
//				System.out.print(num+" ");
//			}
//		}
	}
	
	//sum of odd numbers
//		int arr[]= {9,10,22,8,6,7,3,13,4};
//		int sum=0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2==0) {
//				sum+=arr[i];
//			}
//		}System.out.println(sum);
	
	//2nd Approach
//	    public static void main(String[] args) {
//	        int arr[] = {12, 11, 23, 44, 66, 45, 33};
//	        String evenNumbers = "";
//	        String oddNumbers = "";
//
//	        for (int num : arr) {
//	            if (num % 2 == 0) {
//	                evenNumbers += num + ", ";
//	            } else {
//	                oddNumbers += num + ", ";
//	            }
//	        }
//
////	        // Remove trailing comma and space
////	        if (!evenNumbers.isEmpty()) {
////	            evenNumbers = evenNumbers.substring(0, evenNumbers.length() - 2);
////	        }
////	        if (!oddNumbers.isEmpty()) {
////	            oddNumbers = oddNumbers.substring(0, oddNumbers.length() - 2);
////	        }
//
//	        System.out.println("Even: " + evenNumbers);
//	        System.out.println("Odd: " + oddNumbers);
}

