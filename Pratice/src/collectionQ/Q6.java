package collectionQ;

import java.util.*;

//Q10. Write a program to reverse a Vector using Collections.reverse().

public class Q6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Vector<Integer> v = new Vector<>();
		
		for(int i:arr) {
			v.add(i);
		}
		Collections.reverse(v);
		System.out.println(v);
	}
}
