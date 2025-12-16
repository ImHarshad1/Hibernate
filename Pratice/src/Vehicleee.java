

public class Vehicleee {
    public static void main(String[] args) {
		Vehiclee_deatails[] vehicle={
				new cars(), new Bike()
		};
		for(Vehiclee_deatails v:vehicle) {
			v.start();
			v.fuel();
		}
	}
}
	abstract class Vehiclee_deatails{
		public abstract void start();
		
		public void fuel() {
			System.out.println("Filling fuel.......");
		}
	}
	
	class cars extends Vehiclee_deatails{
		@Override
		public void start() {
			System.out.println("Cars Starts with Key!");
		}
	}
	
	class Bike extends Vehiclee_deatails{
		@Override
		public void start() {
			System.out.println("Bike Starts with a Button!");
		}
	}
