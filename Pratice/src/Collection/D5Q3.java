package Collection;

import java.util.HashMap;
import java.util.Map;

public class D5Q3 {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Laptop", 65000);
		h.put("Mobile", 35000);
		h.put("Watch ", 5000);
		
//		1.entrySet()
		for(Map.Entry<String, Integer> i:h.entrySet()) {
			System.out.println("Products : " + i.getKey() + " Price-->" + i.getValue());
		}
		
//		2.keySet() --> Only keys
		for(String j:h.keySet()) {
			System.out.println(j);
		}
		
//		values()
		for(int p:h.values()) {
			System.out.println(p);
		}
	}

}
