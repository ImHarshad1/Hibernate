package Collection;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class stack {

	public static void main(String[] args) {
		Stack<Object> s1= new Stack<Object>();
		s1.add("Harshad");
		s1.add(22);
		s1.add(true);
		s1.add("Java");
		s1.add(77.77);
		
		System.out.println(s1);
		
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.push("CS"));
		System.out.println(s1);
		System.out.println(s1.size());
		
		//LastInFirstOut
		System.out.println(s1.search(22));
		System.out.println(s1.search("Harshad"));
		
		System.out.println(s1.isEmpty());
		s1.clear();
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		
		Stack<Integer> s = new Stack<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		System.out.println("====================");
		
		Vector<Integer> v = new Vector<>();
		for(int i:s) {
			v.add(i);
		}
		Collections.reverse(v);
		System.out.println(v);
		
		
	}
}