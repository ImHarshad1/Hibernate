package ArrayPractice;
import java.util.Arrays;
public class CountOccuranceSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,2,5};
		int target=2;
		Arrays.sort(arr);
		int first=BinarySearch1(arr,target);
		int last=BinarySearch2(arr,target);
		
		if(first==-1 || last==-1) {
			System.out.println("Element not found ");
		}else {
			int count=last-first+1;
		
		System.out.println("Element "+target+" occurs "+count+" times......");
		}
		//2nd normal way
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==target) {
//				count++;
//			}
//		}
//		System.out.println("Element "+target+" occurs "+count+" times.");
	}
	public static int BinarySearch1(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;

			if(arr[mid]==target) {
				result=mid;
				end=mid-1;
			}else if(arr[mid]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return result;
	}
	public static int BinarySearch2(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;

			if(arr[mid]==target) {
				result=mid;
				start=mid+1;
			}else if(arr[mid]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
	return result;
	}

}
