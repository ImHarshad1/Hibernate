package Collection;

import java.util.HashMap;
import java.util.Map;

public class D6Q3 {

	public static void main(String[] args) {
		String[] order = {"burger","pizza","pizza","coffee","burger","burger"};
		//count frequency
		HashMap<String, Integer> f = new HashMap<>();
		for(String i:order) {
			f.put(i, f.getOrDefault(i, 0) + 1);
//f.getOrDefault(i, 0) means:
//If i (like "burger") already exists in the map → return its current count
//Otherwise → use default 0
		}
	
		//find most frequency
		String most = null;
		int maxCount = 0;
		for(Map.Entry<String, Integer> e : f.entrySet()) {
			if(e.getValue() > maxCount) {
				maxCount = e.getValue();
				most = e.getKey();
			}
		}
		
		if(most !=  null) {
			System.out.println("Most ordered: " + most + "(" + maxCount + "times)");
		}else {
			System.out.println("No Orders");
		}
	}
}
