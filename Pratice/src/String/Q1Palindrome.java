package String;

//Q11. Check if a string is a palindrome.

public class Q1Palindrome {

	public static void main(String[] args) {
		String s = "MAdam";
		String rev =new StringBuilder(s).reverse().toString();
		System.out.println(s.equalsIgnoreCase(rev) ? "Is Palindrom":"Not Palindrome");
		
	}
}
