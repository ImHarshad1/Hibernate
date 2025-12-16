package Box1;

public class Reverse {

	public static void main(String[] args) {
//		int num = 4567;
//		int rev = 0;
//		
//		while(num != 0) {
//			int rem = num%10;
//			rev=(rev*10)+rem;
//			num=num/10;
//		}
//		System.out.println(rev);
		
		int num = 2345;
		int rev = 0;
		
		while(num != 0) {
			int rem = num%10;
			rev=(rev*10)+rem;
			num = num/10;
		}
		System.out.println(rev+" is reverse"); 
	}
}







































