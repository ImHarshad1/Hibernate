package collectionQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Q6. Sort a list of strings in reverse alphabetical order.

public class Q2 {

	public static void main(String[] args) {
		List<String> l= Arrays.asList("John", "Alex", "Bob"); 
		Collections.sort(l);
		System.out.println("After Sorting :"+l);
		Collections.reverse(l);
		System.out.println("After Reverse :"+l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
	}
}
