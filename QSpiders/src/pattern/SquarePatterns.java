package pattern;

public class SquarePatterns {
	public static void sqrdot(int b) {
		for(int i=1; i<=b; i++) {
			for(int j=1; j<=b; j++) {
				if(i==1 || j==1 || i==b || j==b ||
						(b/2)+1== i && (b/2)+1==j)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}System.out.println();
		}
	}
	public static void number(int a) {
		int num=10;
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void sqrNo(int n) {
		 int num=10;
		 int rev=90;
		 for(int i=1; i<=n; i++) {
			 for(int j=1; j<=n; j++) {
				 if(i==1 || j==1 || i==n || j==n) {
					 System.out.print("*  ");
					 num++;
				 }else {
					 System.out.print(rev+" ");
					 rev--;
				 }
				
			 } System.out.println();
		 }
	}
	public static void main(String[] args) {
//		System.out.println("Square inside Numbers :");
//		System.out.println();
//		sqrNo(9);
//		System.out.println();
//		
//		System.out.println("Square With Numbers :");
//		System.out.println();
//		number(5);
//		System.out.println();
		
		System.out.println("Star in centre");
		System.out.println();
		sqrdot(11);
		
	}

}
