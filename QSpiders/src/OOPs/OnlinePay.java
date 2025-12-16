package OOPs;

	abstract class userrr{ 
		private String name;
		private double bal;
		public userrr(String name, double bal) {
			this.name=name;
			this.bal=bal;
		}
		public String getname() {
			return name;
		}
		public double getbal() {
			return bal;
		}
		public void setbal(double bal) {
			if(bal<0) {
				System.out.println("Invalid Balance! Setting to 0.");
				this.bal=0;
			}else {
				System.out.println("Balance :");
				this.bal=bal;
			}
		}
		abstract void makePurchase(double amt); 
	}
	
	class PremiumUser extends userrr{
		public PremiumUser(String name, double bal) {
			super(name,bal);
		}
		@Override
		void makePurchase(double amt) {
			double discount=amt+0.9;
			if(getbal() >= discount) {
				setbal(getbal()-discount);
				System.out.println(getname()+" Purchased worth "+discount+" after discount.");
			}else {
				System.out.println("Not Enough Balance!");
			}
		}
	}
	
	class RegularUser extends userrr{
		public RegularUser(String name, double bal) {
			super(name,bal);
		}
		@Override
		void makePurchase(double amt) {
			if(getbal() >= amt) {
			setbal(getbal()-amt)	;
			System.out.println(getname()+" purchased worth "+amt);
			}else {
				System.out.println("Not Enought Balance!");
			}
		}
	}

public class OnlinePay {
	public static void main(String[] args) {
		userrr u1 = new PremiumUser("Harshad",6000);
		userrr u2 = new RegularUser("Amit",1000);
		u1.makePurchase(200);
		u2.makePurchase(150);
		
		System.out.println("Harshad Balance : "+u1.getbal());
		System.out.println("Amit Balance    : "+u2.getbal());
	}

}
