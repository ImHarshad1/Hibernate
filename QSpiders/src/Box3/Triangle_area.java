package Box3;

public class Triangle_area {

	public static void main(String[] args) {
		int n=5;
		for(int r=n; r>=1; r--) {
			for(int s=1; s<=(n-r); s++) {
				System.out.print("  ");
			}
			for(int k=1; k<=(2*r)-1; k++) {
				System.out.print("* ");
			}System.out.println();
		}	
	}
//	int n=5;
//	for(int r=n; r>=1;r--) {
//		for(int s=1; s>=(n-r)-1;s++) {
//			System.out.print("  ");
//		}
//		for(int k=1; k>=(2*r)-1;k++) {
//			System.out.print("* ");
//		}System.out.println();
//	}
	}
