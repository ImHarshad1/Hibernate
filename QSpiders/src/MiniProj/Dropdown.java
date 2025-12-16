package MiniProj;

import java.util.Scanner;

public class Dropdown {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Your Gender...");
		System.out.println("1.Male");
		System.out.println("2.Female");
		System.out.println("3.Other");
		
		System.out.println("ENter Your Choice...");
		int genderChoice=sc.nextInt();
		String gender="";
		switch(genderChoice) {
		case 1-> gender="Male";
		case 2-> gender="Female";
		case 3-> gender="Other";
		default ->gender="Invalid";
		}
		System.out.println("\nEnter your Education...");
		System.out.println("1.SSC");
		System.out.println("2.HSC");
		System.out.println("3.Graduation");
		System.out.println("4.Post Graduation");
		
		int educationChoice=sc.nextInt();
		String education="";
		
		switch(educationChoice) {
		case 1->education="SSC";
		case 2->education="HSC";
		case 3->education="Graduation";
		case 4->education="Post Graduation";
		default ->education="Invalid";
		}
		System.out.println("Gender is: "+gender);
		System.out.println("Education is: "+education);
	}

}
