package Collection;

import java.util.LinkedList;

public class D3Q2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<>();
		l1.addLast(1);
		l1.addLast(2);
		l1.addLast(3);
		l1.addLast(4);
		System.out.println(l1);
		
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeFirst());
		
		System.out.println(l1.peekFirst());
		System.out.println(l1);	
	}
}
