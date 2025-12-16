package ArrayPractice;

public class SumofPreviousNext {

	public static void main(String[] args) {
		int arr[]= {2,5,7,9,4};
		int n=arr.length;
		int[] result=new int[n];//new array result
		result[0]=arr[0];
		result[n-1]=arr[n-1];
		
//		int sum=0;
		
		for(int i=1; i<n-1; i++) {
			result[i]=arr[i-1]+arr[i+1];
		}
		for(int val:result) {
			System.out.print(val+" ");
		}
	}
}
