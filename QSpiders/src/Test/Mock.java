package Test;

public class Mock {
	public static void pyramid(int n) {
//		n=5;
		for(int i=n; i>=0; i--) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print("  ");
			}
			for(int h=1; h<=(2*i)-1; h++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void odd(int n1, int n2) {
		for(int i=n1; i<=n2;i++){

				if(i%2!=0) {
					System.out.print(i+" ");
				}
		}
		}
	public static void main(String[] args) {
		pyramid(8);
		System.out.println();
		odd(-8,15);
		System.out.println("\n");
		int num=0;
		char character;
		for(int i=65;i<=90;i++) {
			character=(char)i;
			System.out.println(""+num+"  "+character+"  "+i);
			if(num<9) {
				System.out.print("0");
			}
			num++;
		}
	}
}