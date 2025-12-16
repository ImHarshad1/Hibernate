package Static_NonStatic;

class Fortuner{
	String colour;         //In object copy is made of only non-static
//	static String colour;  //static print same data to all, has only single copy
	 int speed;
	double mileage;
	
	public Fortuner(String c,int s, double m){
	colour=c;
	speed=s;
	mileage=m;
	}
	void info() {
		System.out.println("Colour is: "+colour+" Speed is: "+speed+" Mileage is: "+mileage);
	}
}
public class Toyota {

	public static void main(String[] args) {
		Fortuner f1=new Fortuner("White",150,12.5);
		Fortuner f2=new Fortuner("Black",160,15.5);
		f1.info();
//		f2.speed=155;
		f2.info();
		
	}

}
