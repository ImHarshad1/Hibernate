package MiniProj;

public class print2Table {

	public static void main(String[] args) {
		int i=1;
		do {
			int j=2;
		do {
			System.out.print(i*j+"\t");
			j++;
		}
		while(j<=30);
		System.out.println();
		i++;
		}
		while(i<=10);
	}
}