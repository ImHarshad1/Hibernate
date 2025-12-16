package Oops2;

public interface Paymentt {
	void pay(double amt);
}

	class Creditcard implements Paymentt{
		public void pay(double amt) {
			System.out.println("Paid "+amt+" using Credit Card.");
		}
	}
	class UPI implements Paymentt{
		public void pay(double amt) {
			System.out.println("Paid "+amt+" using UPI.");
		}
	}
