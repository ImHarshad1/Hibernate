package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D5Q1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(18, "Virat");
		h.put(45, "Rohit");
		h.put(7, "Donhiii");
		h.put(99, "Bumrah");
		h.put(38, "Hardik");
		
		System.out.println(h);
		
		h.put(7, "Dhoni");
		System.out.println(h);
		h.remove(7);
		System.out.println(h);
		
		//1st Way
		Set<Integer> s = h.keySet();
		for(Integer i:s) {
			System.out.println(i + " --> " + h.get(i));
		}
		System.out.println("================");
		//2nd Way
		for(Map.Entry<Integer, String> entry : h.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}

}
