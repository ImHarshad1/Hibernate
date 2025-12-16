package ArrayPractice;

public class ShiftElementby1 {

	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5};
		//output[5,1,2,3,4]
		int last=arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
//			 last=arr[arr.length
//			System.out.print(arr[i]);
			 arr[i]=arr[i-1];
			System.out.print(arr[i]);
		}System.out.println();
		arr[0]=last;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
