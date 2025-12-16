package MiniProj;

import java.util.Scanner;

public class ATMpin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int pin=1718;
//		int attempts=0;
//		outer:
//		do {
//			System.out.println("Enter your pin");
//			
//			do {
//				int userpin=sc.nextInt();
//				if(pin==userpin) {
//					System.out.println("Welocme to Java ATM....");
//					break outer;
//				}else {
//					attempts++;
//					System.out.println("Incorrect Pin..... Attempts left :"+(3-attempts));
//					
//					if(attempts==3) {
//						System.out.println("\nYour Account is Blocked");
//						break outer; 
//					}
//					System.out.println("\nEnter pin again");
//				}
//			}while(true);
//		}while(true);

		
		
		
		int pin=1718;
		int attempts=0;
		outer:
		do {
			System.out.println("Enter your Pin...");
			
			do {
				int userpin=sc.nextInt();
				if(pin==userpin) {
					System.out.println("Welcome to Java ATM..........");
					break outer;
				}else {
					attempts++;
					System.out.println("Invalid pin attempts left: "+(3-attempts));
					if(attempts==3) {
						System.out.println("\nAccount is Blocked");
						break outer;
					}
					System.out.println("\nEnter pin again");
				}
			}while(true);
		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
