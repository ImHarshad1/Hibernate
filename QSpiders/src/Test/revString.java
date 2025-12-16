package Test;

import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
//		int num=4567;
//		String rev=0;
//		while(num!=0) {
//			int rem=num%10;
//			rev=(rev*10)+rem;
//			num=num/10;
//		}
//		System.out.println(rev);
		Scanner sc=new Scanner (System.in);
		System.out.println("ENter Name: ");
		String str=sc.next();
		String reve="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reve=reve+str.charAt(i);
		}
		System.out.println(reve);
	if(str.equalsIgnoreCase(reve)) {
		System.out.println(str+" Is palindrome");
	}else {
		System.out.println(str+" Is not Palindrome");
	}
}
}
