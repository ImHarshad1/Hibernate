package collectionQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

//Q5. Add an array of integers into an ArrayList and print only even numbers.

public class Q1 {

	public static void main(String[] args) {
		int[] arr = {15,11,10,13,12};
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i:arr) {
			t.add(i);
		}
		System.out.println("Sorted : " + t);
		
		//last() gives last element
		//lower() gives element just smaller last number.
		int max = t.lower(t.last());
		System.out.println(max);
		
		ArrayList<Integer> a =new ArrayList<>();
		for(int i : arr) {
			a.add(i);
		}
		System.out.println(a);
		
		for(int i:a) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}