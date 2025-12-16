package Box2;

public class rev_string {
	public static void palin(String str) {
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)){
			System.out.println(rev + " Is Palindrome");
		}
		else {
			System.out.println(rev + " is not plaindrome");
		}
	}

	public static void main(String[] args) {
		String str ="Naman";
		palin(str);
//		String str = "Naman";
//		String rev = " ";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev + " is Revesre");
//	
//	if(str.equalsIgnoreCase(rev)){
//		System.out.println(str + " is Palindrome");
//	}
//	else {
//		System.out.println(str + "  is not palindrome");
//	}
			
}
}