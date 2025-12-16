package MiniProj;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=sc.nextInt();
		System.out.println("Enter the Operator (+ - % / *)");
		
		char choice=sc.next().charAt(0);
		
		switch(choice) {
		case '+' ->System.out.println("Addition is: "+(num1+num2)); 
		case '-' ->System.out.println("Subtraction is: "+(num1-num2));
		case '*' ->System.out.println("Multipliation is: "+(num1*num2));
		case '/' ->System.out.println("Division is: "+(num1/num2));
		case '%' ->System.out.println("Reaimender is: "+(num1%num2));
		default  ->System.out.println("Invalid operator");
		}
	}
}
