package Array;

import java.util.Arrays;

public class RotateNbyK {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int k=2;
		rotate(arr,k);
		System.out.println(Arrays.toString(arr));
		arr = new int[]{1,2,3,4,5};
		rotate2(arr,k);
		System.out.println(Arrays.toString(arr));
	
	}

	static void rev(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void rotate(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		
		rev(arr,0,n-1);
		rev(arr,0,k-1);
		rev(arr,k,n-1);
	}
	
	static void rotate2(int[] arr, int k) {
		int n=arr.length;
		k=k%n;
		
		rev(arr,0,n-1);
		rev(arr,0,k);
		rev(arr,k+1,n-1);
	}
}