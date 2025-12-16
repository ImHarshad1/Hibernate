package Box2;
import java.util.Scanner;
public class PrimeNo {
	public static boolean isPrime(int a) {
		double b=10;
		if(a<2) {
			return false;
		}
		for(int i=2; i<a; i++) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.print("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		if(isPrime(a)) {
			System.out.println("Given Number Is Primec6"+a);
		}
		else {
			System.out.println(a+" is not Prime");
		}
	}

}
