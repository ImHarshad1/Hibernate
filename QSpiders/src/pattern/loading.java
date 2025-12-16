package pattern;

public class loading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
		for(int r=n; r>=1; r--) {
			for(int s=1;s<=n-r;s++) {
				System.out.print("  ");
			
//			if(r==(n/2)+1 && s==(n/2)+1) {
//			System.out.println("O ");
//		}
			}
			for(int k=1; k<=(2*r)-1; k++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		for(int r=2; r<=n;r++) {
			for(int s=1;s<=n-r;s++) {
				System.out.print("  ");
			}
			for(int k=1; k<=(2*r)-1; k++) {
				System.out.print("* ");
			}
		System.out.println();
		}

	}

}
