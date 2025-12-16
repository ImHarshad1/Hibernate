package Collection;

import java.util.HashSet;

public class D4Q1 {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("Mango");
		h.add("Apple");
		h.add("Banana");
		h.add("Grapes");
		h.add("Pineapple");
		
		System.out.println(h);
		
		System.out.println(h.remove("Grapes"));
		System.out.println(h.contains("Grapes"));
		
		System.out.println(h);
		
	}
}
