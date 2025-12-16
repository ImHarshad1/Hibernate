package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		Map<Object, Object> m = new LinkedHashMap<Object, Object>();
		m.put("Yash", 12);
		m.put(77, true);
		m.put('a', 77.77);
		m.put(null, "Jonny");
		m.put("King", 1);
		System.out.println(m);
		System.out.println(m.get(77));
		System.out.println(m.containsKey('a'));
		System.out.println(m.containsValue(122));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.remove(null));
		System.out.println(m);
		System.out.println("-------------------");
		System.out.println(m.keySet());
//		m.clear();
//		System.out.println(m);
		
		Set<Object> s=m.keySet();
		for(Object i:s) {
			System.out.println(i + "-->" + m.get(i));
		}
	}

}
