package CarShowroom;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
	String empid;
	String name;
	int age;
	String dept;
	
	@Override
	public void get_details() {
		System.out.println("Employee ID  : "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Department : "+dept);
	}
	@Override
	public void set_details() {
		Scanner sc=new Scanner(System.in);
		UUID uuid=UUID.randomUUID();
		empid=String.valueOf(uuid);
		System.out.println("==============*** Enter Employee Details***==============");
		System.out.println();
		System.out.println("Employee Name  : ");
		name=sc.nextLine();
		System.out.println("Employee Age   : ");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Employee Departement  : ");
		dept=sc.nextLine();
		System.out.println("Showroom Name   : ");
		showrromName=sc.next();
		
	}
}