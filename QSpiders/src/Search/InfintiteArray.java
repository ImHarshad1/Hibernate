package Search;

public class InfintiteArray {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,15,18,28,48,69,88,99,101,203,500,999};
		int target=18;
		System.out.println(ans(arr,target));
	}
	static int ans(int[] arr, int target) {//first find the range
		//first start with a box of size 2
		int start=0;
		int end=1;
		//condition for the target to lie in the range
		while(target>arr[end]) {
			int temp=end+1;//this is new start
			//double the box value
			//end=previous end+ SizeOfBox*2
			end=end+(end-start+1)*2;
			start=temp;
		}
		return searchh( arr, target, start, end);
	}
	static int searchh(int[] arr,int target,int start, int end) {	
		
		while(start <= end) {
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
				
			}else if(target>arr[mid]){
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
}

}
