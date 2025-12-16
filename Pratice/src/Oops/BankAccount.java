package Oops;

public class BankAccount {
	long accountNo;
	double balance;
	
	public BankAccount(long accountNO, double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	void deposite(double amt){
		balance+=amt;
		System.out.println("Deposited Amount : "+amt);
	}
	
	void withdrawl(double amt) {
		if(balance >= amt) {
			balance-=amt;
			System.out.println("Withdrawl Amount : "+amt);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void checkbal() {
		System.out.println("Courrent Balance : "+balance);
	}

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(12345,1000);
		a1.deposite(6000);
		a1.withdrawl(700); 
		a1.checkbal();

	}

}
