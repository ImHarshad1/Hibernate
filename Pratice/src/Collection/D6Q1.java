package Collection;

import java.util.Set;
import java.util.TreeMap;

public class D6Q1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(103, "Raj");
		t.put(104, "Rohit");
		t.put(101, "Virat");
		t.put(105, "Smith");
		t.put(102, "Hardik");
		
		System.out.println(t);
	
		Set<Integer> s = t.keySet();
		for(Integer i:s) {
			System.out.println(i + " --> " + t.get(i));
		}
	}

}
