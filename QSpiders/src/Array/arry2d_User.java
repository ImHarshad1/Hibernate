package Array;

import java.util.Scanner;

public class arry2d_User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows ");
		int rn =sc.nextInt();
		System.out.print("Enter Column ");
		int cn=sc.nextInt();
		int [][] arr2D=new int[rn][cn];
		int max=0;
		
		for(int i=0; i<rn; i++) {
			for(int j=0; j<cn; j++) {
				System.out.println("Enter ("+i+"+"+j+") element");
				arr2D[i][j]=sc.nextInt();
			}
		}
		System.out.println("============================");
		for(int i=0;i<rn;i++) {
			for(int j=0;j<cn;j++) {
//				if(arr2D[i][j]>max) {
//					max=arr2D[i][j];	
//				}
				System.out.print(arr2D[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println(max+"Max Element");
	}

}
