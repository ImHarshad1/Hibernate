package String;

import java.util.*;

//Q13. Remove duplicate characters from a string.

public class Q3duplicateCharacters {

	public static void main(String[] args) {
	
		String s = "programming";
		Set<Character> set = new LinkedHashSet<>();
		for(char c:s.toCharArray()) set.add(c);
		
		StringBuilder sb = new StringBuilder();
		for(char c:set) sb.append(c);
		
		System.out.println(sb);

	}
}
