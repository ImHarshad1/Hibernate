package Search;

class Ceiling {

	public static void main(String[] args) {
		int arr[]= {2,3,5,9,18,20,21};
		int target=19;
		int ans=ceiling(arr,target);
		System.out.println(ans);
	}

	//return index of smallest no >=target
	static int ceiling(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(target < arr[mid]) {
				end=mid-1;
			}else if(target > arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return arr[start];
		//here target=19,No are >19 are 20,21 so smallest is 20 thats the ans.
	}
}
