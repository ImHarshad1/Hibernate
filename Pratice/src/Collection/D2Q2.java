package Collection;

import java.util.LinkedList;

public class D2Q2 {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(101);
		queue.add(102);
		queue.add(103);
		queue.add(104);
		queue.add(105);
		System.out.println("Initial Queue: " + queue);
		
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		
		System.out.println("Remaining Queue: "+queue);
	}

}
