package pattern;

public class loadingUnFilled {

	public static void main(String[] args) {
		int n=10;
		for(int r=n; r>=1; r--) {
			for(int s=1; s<=(n-r); s++) {
				System.out.print("  ");
			}
			for(int k=1; k<=(2*r)-1; k++) {
				if(k==1 || k==(2*r)-1 || r==n || r<=8) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int r=2; r<=n; r++) {
			for(int s=1; s<=(n-r); s++) {
				System.out.print("  ");
			}
			for(int k=1; k<=(2*r)-1; k++) {
				if(k==1 || k==(2*r)-1 || r==n ||r==n-1
						||r==n-2 ||k==r) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
