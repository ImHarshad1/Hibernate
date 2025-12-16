package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class D3Q3 {

	public static void main(String[] args) {
		Deque<String> d1 = new ArrayDeque<>();
		
		d1.addFirst("Aman");
		d1.add("Danny");
		d1.add("King");
		d1.addLast("John");
		System.out.println(d1);
		
		System.out.println(d1.removeFirst());
		System.out.println(d1.removeLast());
		
		System.out.println(d1);
	}

}
