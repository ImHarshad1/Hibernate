package collectionQ;

import java.util.*;

//Q8. Convert ArrayList → HashSet → TreeSet.

public class Q4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 1, 3, 2);
		
		HashSet<Integer> h = new HashSet<>(list);
		TreeSet<Integer> t = new TreeSet<>(list);
		
		System.out.println(h);
		System.out.println(t);
	}

}
