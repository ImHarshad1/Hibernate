package pattern;

import java.util.Iterator;

public class Pattern {

	public static void main(String[] args) {	
	int rr=11;
	int cc=11;
	
	for(int r=1; r<=rr; r++) {
		for(int c=1; c<=cc; c++) {
			if(r==1 || c==1 || r==rr || c==cc ||
					r==(rr/2)+1 && c==(cc/2)+1) {
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
