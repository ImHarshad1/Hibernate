package Collection;

import java.util.ArrayList;

public class D1Q1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("John");
		a1.add("Roman");
		a1.add("King");
		a1.add("Bob");
		a1.add("Ronny");
		
		a1.add(2,"Tommy");
		
		a1.remove(5);
//		System.out.println(a1);
		System.out.println("Size: "+a1.size());
		for(String s:a1) {
			System.out.println(s);
		}
	}

}
