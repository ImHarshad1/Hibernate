package Static_NonStatic;

	class ferrari{
		String color="red";
		int speed=220;
		
		void info() {
			System.out.println("Colour is: "+color+" Speed is: "+speed);
		} 
	}

public class FerrariWorld {

	public static void main(String[] args) {
		ferrari f1=new ferrari();
		ferrari f2= new ferrari();
		f1.info();
		f2.info();
		
		System.out.println("===================");
		
		f2.color="Blue";
		f2.speed=240;
		f2.info();
	}

}
