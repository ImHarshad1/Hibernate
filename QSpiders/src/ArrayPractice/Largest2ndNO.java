package ArrayPractice;

public class Largest2ndNO {

	public static void main(String[] args) {
		int arr[]= {10,20,4,45,99};
		int max=arr[0];
		int max2=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max2=max;
				max=arr[i];
			}
				else if(arr[i]>max2 && arr[i]!=max) {
				max2=arr[i];
			}
		}
		System.out.println(max);
		System.out.println("2nd Largest Element is: "+max2);
	}
}
