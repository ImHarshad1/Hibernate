package pattern;

public class Plus {

	public static void main(String[] args) {
		int rr=7;
		int cc=7;
		
		for(int r=1; r<=rr; r++) {
			for(int c=1; c<=cc; c++) {
				if(r==1|| c==1 || r==rr || c==cc || 
						r==(rr/2)+1 || c==(cc/2)+1 ) {
					System.out.print("* ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}










//					else if(r==(rr/2)+1 || c==(cc/2)+1) {
//					System.out.print(" ");