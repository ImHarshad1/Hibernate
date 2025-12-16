package Oops;

 class Owner {
	 public static void main(String[] args) {
		 car c1=new car("BMW","2019","M4 Competition");
		 c1.displayInfo();
		 System.out.println("=========================");
		 bike b1=new bike("Royal Enfiled","2022","GT650");
		 b1.displayInfo();
	 }
	}
 
	class Vehicle{
		 String brand;
			String year;
			
			public Vehicle(String brand, String year) {
				super();
				this.brand = brand;
				this.year = year;
			}
		public void displayInfo() {
		System.out.println("Brand   : "+brand);
		System.out.println("Year    : "+year);
	}
}
	
 class car extends Vehicle{
		String Model;
		
		car(String brand, String year, String Model){
			super(brand,year);
			this.Model=Model;
			
		}
		@Override
		public void displayInfo() {
			super.displayInfo();
			System.out.println("Model   : "+Model);
		}
	}
 	
 	class bike extends Vehicle{
 		String Model;
 		
 		bike(String brand, String year, String Model){
 			super(brand,year);
 			this.Model=Model;
 		}
 		@Override
 		public void displayInfo() {
 			super.displayInfo();
 			System.out.println("Model   : "+Model);
 		}
 	}
	 
