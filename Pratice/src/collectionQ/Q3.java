package collectionQ;

import java.util.HashMap;

//Q7. Write a program to count frequency of each character using HashMap
public class Q3 {

	public static void main(String[] args) {
		String s="Java J2ee";
		
		HashMap<Character,Integer> h = new HashMap<>();
		
		for(char i:s.toCharArray()) {
			h.put(i, h.getOrDefault(i, 0)+1);  //getOrDefault(i, 0) → gets current count or 0 if not present
		}									   //this method is like if-else statement
		System.out.println(h);
	}
}