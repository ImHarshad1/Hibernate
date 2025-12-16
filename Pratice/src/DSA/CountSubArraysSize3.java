package DSA;

public class CountSubArraysSize3 {

	
	static int countSpecialSubArrays(int[] a) {
		int c=0;
		for(int i=0; i<a.length-2; i++) {
			if(a[i] +a[i+2] == a[i+1]) c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 3, 2, 5, 3, 8};
		int ans = countSpecialSubArrays(a);
		System.out.println("Count of special subarrays of size 3: " + ans);
	}
}