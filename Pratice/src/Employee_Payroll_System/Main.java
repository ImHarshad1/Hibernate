package Employee_Payroll_System;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee{
		private String name;
		private int id;
		
		public Employee(String name, int id) {
			this.name=name;
			this.id=id;
		}
		public String getnmae() {
			return name;
		}
		public int getind() {
			return id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setId(int id) {
			this.id = id;
		}
		public abstract double calculateSal();
		
		@Override
		public String toString() {	//toSting(Convert Vale into String) is Function of Collection Frameworks  
			return "Employee [Name= "+name+", Id= "+id+", Salary="+calculateSal()+"]";
		}
	}
	
	class Fulltime extends Employee{
		private double monthlysal;
		
		public Fulltime(String name, int id, double monthlysal) {
			super(name,id);
			this.monthlysal=monthlysal;
		}

		@Override
		public double calculateSal() {
			// TODO Auto-generated method stub
			return monthlysal;
		}
	}

	class Parttime extends Employee{
		private int hours;
		private double hourlyrate;
		
		public Parttime(String name, int id, int hours, double hourlyrate) {
			super(name,id);
			this.hourlyrate=hourlyrate;
			this.hours=hours;
		}
		
		@Override
		public double calculateSal() {
			return hours*hourlyrate;
		}
	}
//	ArrayList<Integer> arr = new ArrayList<>();  //Declaration Part is Writeen in Payroll Constructor
	
	class Payroll{
		private ArrayList<Employee> employeeList;
	
		public Payroll() {
			employeeList = new ArrayList<>();
		}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		}		
		public void removeEmployee(int id) {
			Employee employeeToRemove = null;
			
			for(Employee employee: employeeList) {//In this Loop we wond employe which we want to remove
				if(employee.getind()==id) { 		 //& Store in employeeToRemove now the vale will not be Null 
					employeeToRemove=employee;
					break;
				}
			}
			if(employeeToRemove != null) { //if the value is not Null then we
				employeeList.remove(employeeToRemove); //if value is Null the Employee doesn't Exist in DB
			}
		}
		public void dsiplayEmployee() {
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
		}
	}

public class Main {
	public static void main(String[] args) {
		Payroll p1 = new Payroll();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice != 4) {
			System.out.println("1. Add Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. Display Employees");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter Employee Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Employee ID: ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Employee Salary: ");
				double monthlysal=sc.nextDouble();
				sc.nextLine();
				Fulltime emp1 = new Fulltime(name,id,monthlysal);
				p1.addEmployee(emp1);
				System.out.println("Employee Addesd Succesfully!");
				break;
			case 2:
				System.out.println("Enter Employee ID to remove: ");
				int removeId=sc.nextInt();
				sc.nextLine();
				p1.removeEmployee(removeId);
				System.out.println("Employee removed Successfully!");
				break;
			case 3:
				System.out.println("List of Employees: ");
				p1.dsiplayEmployee();
				break;
			case 4: 
				System.out.println("Exiting Employee Management System...");
				break;
			default:
				System.out.println("Invalid Choice. Try again.");
				break;
			}
		}
		sc.close();
//		Fulltime emp1 = new Fulltime("Ganya",143,11111);
//		Parttime emp2 = new Parttime("Sonya",69,25,500);
//		p1.addEmployee(emp1);
//		p1.addEmployee(emp2);
//		System.out.println("********** Initial Employee Details ***********\n");
//		p1.dsiplayEmployee();
//		System.out.println("-----------------------------------------------");
//		System.out.println("************ Removing Employees ************");
//		p1.removeEmployee(69);
//		System.out.println("\nRemaining Employees Details: ");
//		p1.dsiplayEmployee();
	}
}
