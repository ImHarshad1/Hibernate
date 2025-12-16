package pattern;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print("  ");
			}
//			num=1;
			for(int k=1; k<=(2*i)-1; k++) {
				if(i<=3) {
					System.out.print("0");
				}
				System.out.print(num+" ");
				num++;
			}
			System.out.println();		
		}

	}

}