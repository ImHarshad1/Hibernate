package Array;
import java.util.Scanner;
public class User_Input {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Number: ");
//		int s=sc.nextInt();
//		int arr[]=new int[s];
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("Enter "+i+" Element");
//			arr[i]=sc.nextInt();
//			}
//			System.out.println("====================");
//			
//			for(int i=0; i<arr.length; i++) {
//				System.out.println(i+" = "+arr[i]);
//			}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Number");
		int s=sc.nextInt();
		int arr[]=new int[s];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter "+i+" Element");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+" = "+arr[i]);
		}
		}
	}