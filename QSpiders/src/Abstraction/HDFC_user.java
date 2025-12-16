package Abstraction;

public class HDFC_user {
	public static void main(String[] args) {
		
		ATM1 a1=new Bank();
		a1.Balance();
		a1.Deposite(5000);
		a1.Withdrawl(2000);
		a1.Balance();
		System.out.println("======================");
		ATM2 a2=new Bank();
		a2.Deposite(10000);
		a2.Withdrawl(2500);
		a2.Balance();
		System.out.println("======================");
		ATM1 a3=new Bank();
		a3.Balance();
		a3.Withdrawl(2000);
		a3.Deposite(-6000);
		a3.Withdrawl(1000);
		a3.Deposite(8000);
		a3.Balance();
		System.out.println("======================");
	}
}
