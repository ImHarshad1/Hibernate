package Test;

public class primeNo {
	public static void diamond(int n) {
		n=11;
		for(int s=6;s<=n;s++) {
			for(int k=1;k<=n-s;k++) {
				System.out.print("  ");
			}
			for(int h=1;h<=(2*s)-1;h++) {
				if(s==h || s==6)
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int s=n-1;s>=1;s--) {
			for(int k=1;k<=n-s;k++) {
				System.out.print("  ");
			}
			for(int h=1;h<=(2*s)-1;h++) {
				if(s==h)
				System.out.print("* ");
				
			}
			System.out.println();
			
			}
	}
	public static void pyramid(int n) {
		n=5;
		for(int s=1;s<=n;s++) {
			for(int k=1;k<=n-s;k++) {
				System.out.print("  ");
			}for(int h=1;h<=(2*s)-1;h++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	public static void hollow(int n) {
		n=5;
		for(int r=1;r<=n;r++){
			for(int c=1; c<=n;c++) {
				if(r==1 || c==1 || r==n || c==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	
	public static boolean isprime(int n) {
		if(n<=1) {
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
		// TODO Auto-generated method stub
		int n=11;
		if(isprime(n)) {
		System.out.println(n+" is prime");
	}else {
		System.out.println(n+ " is not prime");
	}
		System.out.println("--------------------------");
		System.out.println("Hollow Square");
		hollow(n);
		
		System.out.println("---------------------------");
		System.out.println("Pyramid ");
		pyramid(n);
		System.out.println("Diamond");
		diamond(n);
	}

}
