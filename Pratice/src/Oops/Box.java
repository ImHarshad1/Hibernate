package Oops;

	abstract class shapeee{
		abstract void calculateArea();
	}
	class Circle extends shapeee{
		double radius;
		
		public Circle(double radius) {
			super();
			this.radius = radius;
		}
		@Override
		public void calculateArea() {
			System.out.println("Area of Circle "+radius+" is : "+3.14*radius*radius);
		}
	}
	class rectangllee extends shapeee{
		double length,width;
		
		public rectangllee(double length, double width) {
			super();
			this.length = length;
			this.width = width;
		}

		@Override
		public void calculateArea() {
			System.out.println("Area of Rectangle is : "+length*width);
		}
	}

public class Box {
	public static void main(String[] args) {
		shapeee[] s1= { new Circle(5), new rectangllee(4,5)};
		for(shapeee s:s1) {
			s.calculateArea();
		}
//				shapeee s2=new Circle(5);
//				s2.calculateArea();
//				shapeee s3=new rectangllee(4,6);
//				s3.calculateArea();
	}
}
