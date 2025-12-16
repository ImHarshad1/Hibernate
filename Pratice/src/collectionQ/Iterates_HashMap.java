package collectionQ;

import java.util.HashMap;
import java.util.Map;

public class Iterates_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("Laptop", 70000);
		h.put("Mobile", 40000);
		h.put("Watch",5000);
		
//		1.entrySet()
		for(Map.Entry<String, Integer> i:h.entrySet()) {
			System.out.println("Prdoucts : " + i.getKey() + " Price -> " + i.getValue());
		}
//		2.keySet() --> Only keys
		for(String j:h.keySet()) {
			System.out.println(j);
		}
//		values()
		for(Integer p:h.values()) {
			System.out.println(p);
		}
	}

}
