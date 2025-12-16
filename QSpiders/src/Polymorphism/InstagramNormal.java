package Polymorphism;

import java.util.Scanner;

public class InstagramNormal {
	Scanner sc=new Scanner(System.in);
	
	void login(String MobNumber) {
		String otp="";
		
		for(int i=1; i<=6; i++) {
			otp = otp+ (int) (Math.random()*10);			
		}
		
		System.out.println("Your OTP is: "+otp);
		
		System.out.println("Enter OTP: ");
		String userotp=sc.next();
		
		if(userotp.equals(otp)) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
	}
	void login(String Email,String Pass) {

		System.out.println("Enter Email : ");
		String Emai=sc.next();
		
		System.out.println("Enter your Password : ");
		String pass=sc.next();
		if(Emai.equals(Email) && pass.equals(Pass)) {
			System.out.println("Login Success");
		}else {
			System.out.println("Check your Email/Pass ");
		}
	}
	
	public static void main(String[] args) {
		InstagramNormal insta = new InstagramNormal();
		Scanner sc = new Scanner(System.in);

	    System.out.println("Choose Login Method: ");
	    System.out.println("1. Mobile OTP");
	    System.out.println("2. Email & Password");
	    int choice = sc.nextInt();

	    if (choice == 1) {
	        insta.login("7770039985");
	    } else if (choice == 2) {
	        insta.login("harsh123@gmail.com", "1234");
	    } else {
	        System.out.println("Invalid choice!");
	    }
	}

}
