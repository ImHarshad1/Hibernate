package Oops;

	class BankAccount1{
		private String Accountno;
		private double balance;
		private String pin;
		 BankAccount1(String Accountno, double balance, String pin) {
			super();
			this.Accountno = Accountno;
			this.balance = balance;
			this.pin=pin;
		}
		public String getMaskedAccountno() {
			return "XXXX" + Accountno.substring(Accountno.length()-4);
		}
		public double getbalance(String enterdepin) { 
			if(this.pin.equals(enterdepin)) {
			return balance;
			}else {
				System.out.println("Invalid PIN! Cannot show Balance.");
				return -1;
			}
		}
		
		public void Deposite(double amt) {
			if(amt>0) {
			balance+=amt;
			System.out.println("Deposited : "+amt+", Balance = "+balance);
			}else {
				System.out.println("Invalid deposite Amount.");
			}
		}
		public void Withdrawl(double amt,String enteredpin) {
			if(!this.pin.equals(enteredpin)) {
				System.out.println("Invalid PIN! Withdrawl denied.");
				return;
			}
			if(balance>=amt && amt>0) {
				balance-=amt;
				System.out.println("Withdrawl : "+amt);
			}else {
				System.out.println("Insufficient Balance ");
			}
		}
	}

public class BANK1 {
	public static void main(String[] args) {
		BankAccount1 b1=new BankAccount1("12345678",2000,"1234");
		System.out.println("Account Number: "+b1.getMaskedAccountno());
		b1.Deposite(6000);
		System.out.println("Balance (wrong PIN): "+b1.getbalance("0000"));
		System.out.println("Balance (correct PIN): "+b1.getbalance("1234"));
		b1.Withdrawl(2000,"0000");
		b1.Withdrawl(600,"1234");
		System.out.println("Final Balance: "+b1.getbalance("1234"));
	}

}
