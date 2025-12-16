package Collection;

import java.util.*;
import java.util.HashMap;

public class D5Q2 {

	public static void main(String[] args) {
		String[] s = {"apple","banana","apple","orange","banana","apple","banana","banana"};
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		for(String i:s) {
			if(h.containsKey(i)) {
				h.put(i, h.get(i) + 1);
			} else {
				h.put(i, 1);
			}
		}
		
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(h.entrySet());
		list.sort((a,b) -> b.getValue().compareTo(a.getValue()));
		
		for(Map.Entry<String, Integer> en : list) {
			System.out.println(en.getKey() + " --> " + en.getValue());
		}
	}

}
