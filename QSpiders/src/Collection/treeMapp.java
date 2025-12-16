package Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treeMapp {

	public static void main(String[] args) {
		Map<Integer, Object> m = new TreeMap<Integer, Object>();
		m.put(500, 12);
		m.put(234, "Hasrsh");
		m.put(200, 33.3);
		m.put(100, true);
		m.put(900,'a');
		System.out.println(m);
		
		Set<Integer> s = m.keySet();
		for(Integer i:s) {
			System.out.println(i + "-->" + m.get(i));
		}
		
	}
}