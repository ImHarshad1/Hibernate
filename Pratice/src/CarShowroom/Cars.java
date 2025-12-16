package CarShowroom;

import java.util.Scanner;

public class Cars extends Showroom implements utility{
	String carName;
	String color;
	String fuelType;
	int price;
	String carType;
	String transmission;
	
	@Override
	public void get_details() {
		System.out.println("Car Name  : "+carName);
		System.out.println("Car Color : "+color);
		System.out.println("Fuel Type : "+fuelType);
		System.out.println("Car Price : "+price);
		System.out.println("Car type  : "+carType);
		System.out.println("Transmission : "+transmission);
	}
	@Override
	public void set_details() {
		Scanner sc=new Scanner(System.in);
		System.out.print("==============*** Enter Car Details***==============");
		System.out.println();
		System.out.print("Car Name   : ");
		carName=sc.nextLine();
		System.out.print("Car Color  : ");
		color=sc.nextLine();
		System.out.print("Fuel Type (Petrol/Diesel : ");
		fuelType=sc.nextLine();
		System.out.print("Car Price  : ");
		price=sc.nextInt();
		sc.nextLine();
		System.out.print("Car Type (Seadan/SUV/HatchBack  : ");
		carType=sc.nextLine();
		System.out.println("Transmission (Automatic/Manual : ");
		transmission=sc.nextLine();
		totalCars++;
	}
}
