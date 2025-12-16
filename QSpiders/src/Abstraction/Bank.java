package Abstraction;

public class Bank implements ATM1,ATM2,ATM3 {
	int TotalBal=0;
	
	@Override
	public void Deposite(int amt1) {
		if(amt1>0) {
			TotalBal +=amt1;
			System.out.println(amt1+" Deposited Successfully");
		}else {
			System.out.println("Enter Valid Deposite Amount");
		}
	}
	@Override
	public void Withdrawl(int amt2) {
		if(amt2<=TotalBal) {
			TotalBal-=amt2;
			System.out.println(amt2+" Withdrawl Successfully");
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	@Override
	public void Balance() {
		System.out.println("Total Balance is: "+TotalBal);
	}
}
