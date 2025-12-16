package ArrayPractice;

public class CountFreqAll {

	public static void main(String[] args) {
		int arr[]= {2,3,3,3,3,4,4,3,2,2,5,5,14};
		int n=arr.length;
		int[] freq=new int[n];
		int max=arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];	
			}
			if(arr[i]>=1 && arr[i]<=n) {
				freq[arr[i]-1]++;
			}
//			int index=(arr[i]%n-1+n)%n;
//			arr[index]+=n;
		}
		for(int i=0; i<max; i++) {
			System.out.println("Element is :"+(i+1)+"-> "+freq[i]+"times");
		}
	}
}
