package Array;

public class Cap_Small_No_Special {

	public static void main(String[] args) {
		String str="Bade Miya 432567 @ = Chote Miya";
		int uCount=0;
		int lCount=0;
		int nCount=0;
		int sCount=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90) {
				uCount++;
			}else if(ch>=97 && ch<=122) {
				lCount++;
			}else if(ch>=48 && ch<=57) {
				nCount++;
			}else {
				sCount++;
			}
		}
		System.out.println(uCount+" Upper Case");
		System.out.println(lCount+" Lower Case");
		System.out.println(nCount+" Numbers");
		System.out.println(sCount+" Special Characters");
	}

}
