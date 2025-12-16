package Static_NonStatic;

 class volkswagen{
	 String colour;
	 int price;
	 String model;
	 double Bcap;
 
 public volkswagen(String colour, int price, String model, double Bcap) {
	 this.colour=colour;
	 this.price=price;
	 this.model=model;
	 this.Bcap=Bcap;
	 System.out.println("THis Contains :"+this);
 }	 
 void details() {
	 System.out.println("Colour is: "+colour+" Price is: "+price+" Model is: "+model+"battery Capacity is: "+Bcap);
 }
 }
 
public class Audi_This {
	public static void main(String[] args) {
		volkswagen v1=new volkswagen("Black",180,"Q8",5000);
		System.out.println("V1 contains "+v1);
		v1.details();
		
		volkswagen v2=new volkswagen("Weite",160,"Q8",6000);
		v2.details();
		
		volkswagen v3=new volkswagen("Blue",190,"Q8",5500);
		v3.details();

	}
}