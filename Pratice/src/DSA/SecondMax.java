package DSA;

public class SecondMax {
  
	public static void main(String[] args) {
		int[] arr = {12,10,1,17,15};
		secondmax(arr);
//		System.out.println(ans);
		
	}
	static void secondmax(int[] arr) {
		int max = 0;
		int max2 = 0;
		
		for(int i:arr) {
			if(i>max) {
				max2=max;
				max=i;
			} else if(i>max2 && i!=max) {
				max2=i;
			}
		}
		System.out.println(max2);
	}
}