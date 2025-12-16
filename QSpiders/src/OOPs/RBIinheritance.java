package OOPs;

public class RBIinheritance {
	double balance;
	
	void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposite Successfull: "+balance);
		}
	}
}
