
	abstract class shape implements Drawable{
		String color;
	//abstract class can implement an Interface, ans is Yes, but it doesn't need to implement all methods,subclasses can complete them
		shape(String color){
			this.color=color;
		}
		public void draw() {               
			System.out.println("hiiiiiiiiiii");
		}
		void displayColor() {
			System.out.println("Color: "+color);
		}
	}
//	class Circle extends shape{
//		Circle(String color){
//		super(color);
//		}
//		@Override 
//		public void draw() {
//			System.out.println("Drawing a Circle");
//		}
//	}


public class Test {
	public static void main(String[] args) {
		shape s1=new shape("Black") {};
		s1.draw();
		s1.displayColor();
	}

}
