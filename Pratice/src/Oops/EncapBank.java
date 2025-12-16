package Oops;

	class bankacc{
		private int accno;
		private double bal;
		private double interestrate;
		
		public bankacc(int accno, double bal, double interestrate) {
			this.accno=accno;
			this.bal=bal;
			this.interestrate=interestrate;
		}
		public int getaccno() {
			return accno;
		}
		public double getbal() {
			return bal;
		}
		public void deposite(double amt) {
			if(amt>0) {
				bal+=amt;
				System.out.println("Deposited: "+amt);
			}
		}
		public void withdrawl(double amt) {
			if(bal>=amt) {
				bal-=amt;
				System.out.println("Withdrawl: "+amt);
			}
		}
		public double calculateinterest() {
			return bal*interestrate/100;
		}
	}

public class EncapBank {
	public static void main(String[] args) {
		bankacc b1=new bankacc(1234,5000,7.5);
		b1.deposite(3000);
		System.out.println(b1.getbal()) ;
		b1.withdrawl(3000);
		System.out.println(b1.calculateinterest());
		System.out.println(b1.getbal());
	}

}
