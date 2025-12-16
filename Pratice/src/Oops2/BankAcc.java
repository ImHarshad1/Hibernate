package Oops2;

	class bankk{
	private int actno;
	private double bal;
	public bankk(int actno, double bal) {
		super();
		this.actno = actno;
		this.bal = bal;
	}
	public double getBal() {
		return bal;
	}
	public void deposite(double amt) {
		if(amt > 0) {
			bal+=amt;
			System.out.println("Deposited : "+amt);
		}else {
			System.out.println("AMount can not be in Minus");
		}
	}
	public void withdrawl(double amt) {
		if(bal>=amt) {
			bal-=amt;
			System.out.println("Withdrawl Succesfully : "+amt);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	}
public class BankAcc {
	public static void main(String[] args) {
		bankk b1=new bankk(12345,5000);
		b1.deposite(1000);
		b1.withdrawl(3000);
		System.out.println("Balance Is: "+b1.getBal());
	}

}
