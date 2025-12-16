package CarShowroom;

import java.util.Scanner;

public class Showroom implements utility{
	String showrromName;
	String address;
	String ManagerName;
	int totalEmp;
	int totalCars=0;
	
	@Override
	public void get_details() {
		System.out.println("Showrrom Name     : "+showrromName);
		System.out.println("Showrrom Address  : "+address);
		System.out.println("Manager Name      : "+ManagerName);
		System.out.println("Total Employees   : "+totalEmp);
		System.out.println("Total Cars in Stock : "+totalCars);
	}
	@Override
	public void set_details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("==============*** Enter Showroom Details***==============");
		System.out.println();
		System.out.println("Showrrom Name       : ");
		showrromName=sc.nextLine();
		System.out.println("Showrrom Address    : ");
		address=sc.nextLine();
		System.out.println("Manager Name        : ");
		ManagerName=sc.nextLine();
		System.out.println("Total Employees     : ");
		totalEmp=sc.nextInt();
		System.out.println("Total cars in Stock : ");
		totalCars=sc.nextInt();
		
	}
}