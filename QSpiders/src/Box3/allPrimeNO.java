package Box3;

public class allPrimeNO {
	public static boolean isprime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%2==0) {
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
		if(isprime(i)) {
			System.out.println(i+" Is Prime");
		    }
	    }
	}
}
