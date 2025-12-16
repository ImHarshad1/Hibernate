package Oops;

	abstract class find{
		abstract double area();
	}

	class circle extends find{
		double radius;
		
		circle(double radius){
			this.radius=radius;
		}
		@Override
		double area() {
			return 3.14 * radius * radius;
		}
	}
	
	class rectangle extends find{
		double length;
		double width;
		
		public rectangle(double length, double width) {
			super();
			this.length = length;
			this.width = width;
		}
		@Override
		double area() {
			return length*width;
		}
	}

public class Shape {
	public static void main(String[] args) {
		find[] shapes=new find[] {
			new circle(5),
			new rectangle(4,5)
		};
		for(find s: shapes) {
			System.out.println("Area of "+s.getClass().getSimpleName()+": "+s.area());
		}
		}

}
