package Search;

public class OrderAgnostics {

	public static void main(String[] args) {
		int arr[]= {99,88,77,66,10,18,5,4,3,2,-7};
		int target=18;
		int ans=orderAgnos(arr, target);
		System.out.println(ans);
	}
	static int orderAgnos(int[] arr, int target) {
		int start=0; 
		int end=arr.length-1;
			
		boolean isAsc = arr[start]<arr[end];
		
		while(start <= end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else {
				if(target > arr[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
		}
		return -1;
	}
}
