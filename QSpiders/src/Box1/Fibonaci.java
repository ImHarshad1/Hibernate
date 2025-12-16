package Box1;

public class Fibonaci {

	public static void main(String[] args) {
//		int n1 = 0, n2 = 1;
//		int limit = 10;
//		
//		System.out.print(n1 + " " +n2 + " ");
//		
//		for(int i = 3; i <= limit; i++) {
//			
//		int n3=n1+n2;
//			System.out.print(n3 +" ");
//			
//		n1=n2;
//		n2=n3;
		
		int n1=0,n2=5;
		int limit=10;
		
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=limit;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		}	
}
