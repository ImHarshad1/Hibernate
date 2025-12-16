package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vectorr {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(99);
		v1.add(55);
		v1.add(18);
		v1.add(77);
		v1.add(69);
		v1.add(35);
		
		Collections.sort(v1);
		System.out.println(v1);
		
		for(Integer i:v1) {
			System.out.println(i);
		}
		
		Collections.reverse(v1);
		System.out.println(v1);
		
		Iterator i1 = v1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("===============");
		
		int[] arr= {1,2,3,4,5,6};
		
		Vector<Integer> v = new Vector<>();
		
		for(int i:arr) {
			v.add(i);
		}
		Collections.reverse(v);
		System.out.println(v);
	}
}
