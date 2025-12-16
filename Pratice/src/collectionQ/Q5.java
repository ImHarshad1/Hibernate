package collectionQ;

import java.util.*;

//Q9. Write a Queue example using LinkedList and perform add(), peek(), poll().
public class Q5 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);

		System.out.println(q.peek());
		System.out.println(q.poll());
	}
}