package Test;

public class BinarySearch {

	public static void main(String[] args) {
//		int[] arr= {1,3,5,6};
		int[] arr= {1,2,1,3,5,6};
//		int target=2;
		int ans=search(arr);
		System.out.println("Peak element index:  "+ans);
		System.out.println("Peak element Value: "+arr[ans]);
	}
	 static int search(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			
//			if(target==arr[mid]) {
//				return mid;
//			}
//			else if(target<arr[mid]) {
//				end=mid-1;
//			}else{
//				start=mid+1;
//			}
//		}
		//Peak Element 
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return start;
	}

}
