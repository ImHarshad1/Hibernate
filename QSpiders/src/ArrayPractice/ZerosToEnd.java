package ArrayPractice;

public class ZerosToEnd {

	public static void main(String[] args) {
		int arr[]= {0,1,0,12,3};
		int j=0;
		//remove non zero elements
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}	
			//[1,12,3,12,3] for loop ans,here j=3
		}
		//add Zeros in last index,it will print 0s at index 3 and 4.
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		//to print the ans
		System.out.println("Output: ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
