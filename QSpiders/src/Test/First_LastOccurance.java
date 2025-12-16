package Test;

public class First_LastOccurance {
	public static int firstOccurance(int[] arr, int x) {
		int ans= -1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(x==arr[mid]) {
				ans= mid;
				end=mid-1;
				
			}else if(x<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
			return ans;
		}		
					
		public static int SecondOccurance(int[] arr, int x) {
			int start=0;
			int end=arr.length-1;
			int ans=-1;
			while(start<=end) {
				int mid=start+(end-start)/2;
				
				if(x==arr[mid]) {
					ans = mid;
					start=mid+1;
				}else if(x<arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}	
		}return ans;		
	}
		public static void main(String[] args) {
		int arr[]= {1,2,2,2,3,4,5};
		int x=2;
		int first=firstOccurance(arr,x);
		int last=SecondOccurance(arr,x);
		System.out.println("["+first+" , "+last+"]");
		}
	}


