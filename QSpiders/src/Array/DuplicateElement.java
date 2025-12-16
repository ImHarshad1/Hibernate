package Array;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Elements");
//		String s=sc.nextLine();
//		String arr[]=new String[s];
		String arr[]= {"java","c","c++","python","java"};
		boolean res=false;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Element is: "+arr[i]);
					res=true;
					break;
				}
			}	
		}
		if(res==false) {
				System.out.println("Duplicate Element is not found");
			}
		}
	}