package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class D1Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(60,75,88,90,75));
		
		int index=a1.indexOf(75);
		System.out.println("INDEX OF FIRST 75: "+index);
		
		if(index != -1) {
		a1.set(index, 76);
		}
		System.out.println("Updated Marks: "+a1);
		
	}
}
