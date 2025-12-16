package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class D2Q1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Mumbai");
		l1.add("Delhi");
		l1.add("Pune");
		l1.add("Chennai");
		l1.add("Banglore");
		
		l1.addFirst("Thane");
		l1.addLast("Kerela");
		System.out.println("Cities: "+l1);
		
		for(String s:l1) {
			System.out.print(s + " ");
		}
		System.out.println("\nUsing Iterator: ");
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
