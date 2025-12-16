package Search;
import java.util.Arrays;
public class FirstLastOccurance {

	public static void main(String[] args) {
		int arr[]= {1,7,2,7,7,8,8,7,9};
		int target=7;
		Arrays.sort(arr);
		// Create an instance of FirstLastOccurance to call the non-static method
        FirstLastOccurance obj = new FirstLastOccurance();
        int[] ans = obj.searchRange(arr, target);
        System.out.println(Arrays.toString(arr));
        System.out.println("First and Last Occurrence: [" + ans[0] + ", " + ans[1] + "]");
	}
	public int[] searchRange(int[] arr, int target) {
		int[] ans= {-1,-1};
		
		int start=search(arr, target, true);
		int end=search(arr, target, false);
		ans[0]=start;
		ans[1]=end;
		
		return ans;
	}

	int search(int[] arr, int target, boolean findStar) {
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]){
				start=mid+1;
			}else {
				ans=mid;
				if(findStar) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return ans;
	}
}
