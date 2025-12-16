package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class D2Q3 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer> (Arrays.asList(10,20,30));
		LinkedList<Integer> l2 = new LinkedList<Integer> (Arrays.asList(40,50,60));
		
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		l3.addAll(l2);
		l3.addAll(l1);
		
		System.out.println("Merged List: " + l3);
	}
}
