package pattern;

public class revNum {

	public static void main(String[] args) {
//		int r=5;
//		int c=5;
//		
//		for(int i=r;i>=1;i--) {
//			for(int j=1;j<=c;j++) {
//				System.out.print(i+" ");
//			}System.out.println(" ");
//		}	
		
//		int r = 5;
//		int c = 5;
//		for(int i=r;i>=1;i--){
//			for(int j=1; j<=c;j++) {
//				System.out.print(i+"");
//			}
//			System.out.println();
//		}
	int rn=5;
	int cn=5;
	
	for(int r=1; r<=rn; r++ ) {
		for(int c=1; c<=cn;c++) {
			if( r==(rn/2)+1 && c==(cn/2)+1) {
				System.out.print("O ");
			}
			else if(r==1 || c==1 || c==cn || r==rn || r==c) {
				System.out.print("* ");
		}else {
			System.out.print("  ");
			}
			}
	System.out.println();
	}
	}
}
