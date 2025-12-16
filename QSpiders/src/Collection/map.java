package Collection;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		Map<Integer, Object> m = new HashMap<Integer, Object>();		
		m.put(500, "John");
		m.put(522, "King");
		m.put(497, "Travis");
		m.put(496, "Head");
		m.put(518, "Virat");
		m.put(501, "Alice");
		m.put(499, "Bob");

		System.out.println(m);

	}
}
