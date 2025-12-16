package ATM_Machine;

import java.util.*;
import java.util.Scanner;

class ATM{
		float balance;
		int pin=5674;
		
		public void checkpin() {
			System.out.println("Enter your Pin  : ");
			Scanner sc=new Scanner(System.in);
			int enteredpin=sc.nextInt();
			if(enteredpin==pin) {
				menu();			
			}else {
				System.out.println("Enter a valid Pin :");
				menu();
			}
		}
		
		public void menu() {
			System.out.println("Enter Your Choice :");
			System.out.println("1. Check your A/C Balance");
			System.out.println("2. Withdrawl Money");
			System.out.println("3. Deposite Money");
			System.out.println("4. Exit");
			
			Scanner sc=new Scanner(System.in);
			int opt=sc.nextInt();
	
			if(opt == 1) {
				checkBalance();
			}else if(opt == 2) {
				withdrawlMoney();
			}else if(opt == 3) {
				depositeMoney();
			}else if(opt == 4) {
				return;
			}else {
				System.out.println("Enter a valid choice ");
			}
		}
		
		public void checkBalance() {
			System.out.println("Balance : "+balance);
			menu();
		}
		
		public void withdrawlMoney() {
			System.out.println("Enter Amout to Withdrawl : ");
			Scanner sc=new Scanner(System.in);
			float amount=sc.nextFloat();
			if(amount>balance) {
				System.out.println("Insufficient Balance ");
			}else {
				balance=balance-amount;
			}
			menu();
		}
		
		public void depositeMoney() {
			System.out.println("Enter Amout to Deposite : ");
			Scanner sc=new Scanner(System.in);
			float amount=sc.nextFloat();
			balance+=amount;
			System.out.println("Money Deposited Succesfully ");
			menu();
		}
	}

public class ATMMachine {

	public static void main(String[] args) {
		ATM a1=new ATM();
		a1.checkpin();
	}

}
