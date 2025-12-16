package ArrayPractice;

public class CountPeaks {

	public static void main(String[] args) {
		int arr[]= {1,3,2,4,1,0,5};
		int count=0;
		int n=arr.length;
		//check first element
		if(n>1 && arr[0]>arr[1]) {
			count++;
		}
		//check middle element
		for(int i=1; i<n-1; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				count++;
			}
			}
		//check last element
		if(n>1 && arr[n-1]>arr[n-2]) {
			count++;
		}
			System.out.println(count);
		}
	}