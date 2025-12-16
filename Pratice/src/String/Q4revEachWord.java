package String;

//Q14. Reverse each word in a sentence.

public class Q4revEachWord {

	public static void main(String[] args) {
		String s = "Java is fun";
		String[] ar=s.split(" ");
		StringBuilder out = new StringBuilder();
		
		for(String w:ar) {
			out.append(new StringBuilder(w).reverse()).append(" ");
		}
		System.out.println(out.toString().trim());
	}

}
