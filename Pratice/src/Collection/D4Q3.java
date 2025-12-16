package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class D4Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		
		HashSet<Integer> h =new HashSet<>(a);
		System.out.println(h);
				
		//Convert back to ArrayList 
		ArrayList<Integer> unique = new ArrayList<>(h);
		System.out.println(unique);
		
				
	}

}
