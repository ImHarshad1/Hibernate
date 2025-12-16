package Array;

import java.util.Arrays;

public class EqualityOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(arr1, arr2);
		if(status==true) {
			System.out.println("Array is Sorted");
		}else {
			System.out.println("Array is not Sorted");
		}
	}

}
