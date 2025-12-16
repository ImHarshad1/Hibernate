package Oops2;

public class Payment {

	public static void main(String[] args) {
		Paymentt[] payy= {new Creditcard(), new UPI()};
		
		for(Paymentt p:payy) {
			p.pay(500);
		}
	}

}
