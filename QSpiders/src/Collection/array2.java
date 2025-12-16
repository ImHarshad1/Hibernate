package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class array2 {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(2);
		a.add(20);
		a.add(5);
		a.add(7);
		System.out.println(a);
		
		Vector<Integer> v = new Vector<>();
		for(int i:a) {
			v.add(i);
		}
		Collections.reverse(v);
		System.out.println(v);
		
//		ArrayList<Object> b=new ArrayList<Object>(a);
//		b.add("John");
//		b.add(38);
//		b.add("Wrestler");
//		
//		b.addAll(a);
//		System.out.println(b);
	}

}
