package pattern;


public class diamond {
	
public static void star(int n) {
	
	for(int r=1; r<=n; r++) {
		for(int c=1; c<=n-r; c++) {
			System.out.print("  ");
		}
		for(int k=1; k<=(2*r)-1; k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	for(int r=n-1; r>=1; r--) {
		for(int c=1; c<=n-r; c++) {
			System.out.print("  ");
		}
		for(int k=1; k<=(2*r)-1; k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
}
	public static void main(String[] args) {
	star(7);
	
}
}
