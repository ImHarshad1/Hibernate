package Collection;

import java.util.LinkedHashSet;

public class D4Q2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(17);
		l.add(18);
		l.add(45);
		l.add(17);
		l.add(18);
		
		System.out.println(l);
		l.add(10);
		System.out.println(l);
	}
}
