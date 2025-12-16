package Oops;

	class Animal{
		public void sound() {
			System.out.println("Add Animal Sound");
		}
	}
	class dog extends Animal{
		@Override
		public void sound() {
			System.out.println("Dog Barks  : Bhooow Bhooow");
		}
	}
	class cat extends Animal{
		@Override
		public void sound() {
			System.out.println("Cat Meowa  : Mewoow Meooowwww");
		}
	}
	
public class Zoo {
	public static void main(String[] args) {
		Animal a1=new dog();
		a1.sound();
		Animal a2=new cat();
		a2.sound();
	}

}
