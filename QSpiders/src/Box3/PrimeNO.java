package Box3;
import java.util.Scanner;
public class PrimeNO {
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.print("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(prime(n)) {
			System.out.println("Is Prime "+n);
		}
		else {
			System.out.println("is not Prime"+n);
		}
		System.out.println("Main End");
	}
}