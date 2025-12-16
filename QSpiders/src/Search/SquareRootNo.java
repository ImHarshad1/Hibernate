package Search;

public class SquareRootNo {

	public static void main(String[] args) {
		int i=10;
		
		int result=sqrtno(i);
		System.out.println("Square root of "+i+" is "+result);
	}
		public static int sqrtno(int i) {
		int start=1;
		int end=i;
		int ans=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(mid*mid==i) {
				ans=mid;
				break;
			}
			else if(mid*mid<i) {
				ans=mid;
				start=mid+1;
				
			}else {
				end=mid-1;
			}
		}
		return ans;
	}
}
