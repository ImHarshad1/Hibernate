package Oops;

	class BankAccountt{
		long Acctno;
		double balance;
		
		public BankAccountt(long Acctno, double balance){
			this.Acctno=Acctno;
			this.balance=balance;
		}
		
		public void deposite(double amt) {
			balance+=amt;
			System.out.println("Deposited  : "+amt);
		}
		
		public void withdrawl(double amt) {
			if(balance >= amt) {
				balance-=amt;
				System.out.println("Withdraw  :"+amt);
			}else {
				System.out.println("Insufficient Balance");
			}
		}
		
		public void checkBal() {
			System.out.println("Balance   : "+balance);
		}
	}
	
	class SavingsAcc extends BankAccountt {
		double interestrate;
		
		SavingsAcc(long Acctno, double balance, double interestrate){
			super(Acctno,balance);
			this.interestrate=interestrate;
		}
		
		public void addinterest() {
			balance+=balance*interestrate/100;
			System.out.println("Balance after Interest : "+balance);
		}
	}


public class Bank {

	public static void main(String[] args) {
		SavingsAcc s1=new SavingsAcc(387009007,1000,5);
		s1.deposite(1000);
		s1.withdrawl(200);
		s1.checkBal();
		s1.addinterest();
		
	}

}
