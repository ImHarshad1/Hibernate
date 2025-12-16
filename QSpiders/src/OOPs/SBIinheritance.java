package OOPs;

public class SBIinheritance extends RBIinheritance {

	void deposite() {
		int age=22;
		if(age>=18) {	
			super.deposite(10000);    //parent this call RBI
	}else {
		System.out.println("Can't Deposite");
		}
   }
	public static void main(String[] args) {
		SBIinheritance s1=new SBIinheritance();
		s1.balance=2000;
		s1.deposite();
	}

}
