package Array;

public class Capital_Smaal_Letter {

	public static void main(String[] args) {
		String str="Bade Miya Chote Miya";
		int uCount=0;
		int lCount=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90) {
				uCount++;
			} else if(ch>=97 && ch<=122) {
				lCount++;
			}
		}
		System.out.println(uCount+" Upper Case");
		System.out.println(lCount+" Lowercase");
	}

}
