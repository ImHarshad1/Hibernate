package String;

import java.util.*;

//Q15. Find the frequency of each word in a sentence.

public class Q5reqEachWord {

	public static void main(String[] args) {
		String s = "java is fun and java is powerful";
		String[] w = s.split(" ");
		Map<String,Integer> map = new HashMap<>();

		for(String x : w)
		    map.put(x, map.getOrDefault(x, 0) + 1);

		System.out.println(map);

	}
}
