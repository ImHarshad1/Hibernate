package Oops;

	class Creditcard implements paymenttt{
		@Override
		public void pay(double amt) {
			System.out.println("Paid "+amt+" using Credit Card.");
		}
	}
	class UPI implements paymenttt{
		@Override 
		public void pay(double amt) {
			System.out.println("Paid "+amt+" using Credit Card");
		}
	}

public class PaymentDemo {
	public static void main(String[] args) {
		paymenttt[] p= {
				new Creditcard(), new UPI()
		};
		double[] amts= {2500.0,1800.5};
		for(int i=0; i<p.length; i++) {
			p[i].pay(amts[i]);
		}
	}
}
