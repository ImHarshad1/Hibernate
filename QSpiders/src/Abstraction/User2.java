package Abstraction;

public class User2 {

	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2();
		System.out.println(m1.x);
		m1.games();
		System.out.println(m1.b1.i);
		m1.b1.capacity();
		Mobile2.b1.capacity();
		System.out.println();
	}

}
