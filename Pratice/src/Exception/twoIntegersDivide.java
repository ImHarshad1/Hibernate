package Exception;

import java.util.*;

public class twoIntegersDivide {
//Q1. Write a program to take two integers and divide them. Handle ArithmeticException and NumberFormatException.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hiiiiiiiiiii");
		try {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			System.out.println("Results:-"+(a/b));
		}catch(ArithmeticException  e){
			System.out.println("Cannot divide by zero");
		}catch(NullPointerException n) {
			System.out.println("Enter only numbers!");
		}finally {
			System.out.println("I'm Don");
		}

	}

}
