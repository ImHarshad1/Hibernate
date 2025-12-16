package ArrayPractice;

public class All_ZerosToEnd2 {

	public static void main(String[] args) {
		int arr[]= {0,1,0,12,3};
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}	
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		System.out.println("Output: ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
