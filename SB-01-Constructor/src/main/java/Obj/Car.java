package Obj;

public class Car {
	private String brand;
	private Double price;
	private Engine engine;
	
	public Car(String brand, Double price, Engine engine) {
		super();
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}

	public void display() {
		System.out.println("--------Car--------");
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("cc : " + engine.getcc());
		engine.start();
	}
}
