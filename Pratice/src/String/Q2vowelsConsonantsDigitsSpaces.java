package String;

//Q12. Count vowels, consonants, digits, spaces.

public class Q2vowelsConsonantsDigitsSpaces {
	public static void main(String[] args) {
		String s = "Hello 123";
		int v=0,c=0,d=0,sp=0;
		
		for(char i:s.toCharArray()) {
			if("aeiouAEIOU".contains(String.valueOf(i)) ) {
				v++;
			} else if(Character.isDigit(i)){
				d++;
			} else if(Character.isLetter(i)) {
				c++;
//			} else if(Character.isWhitespace(i)) {
//				sp++;
			} else if(i==' ') {
				sp++;
			}
		}
		System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Spaces: " + sp);
	}
}