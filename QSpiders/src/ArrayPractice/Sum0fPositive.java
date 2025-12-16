package ArrayPractice;

public class Sum0fPositive {

	public static void main(String[] args) {
		int arr[]= {1,-2,3,-4,5};
		int sum=0;
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>=0) {
			sum+=arr[i];
			}
		}
		System.out.println("Sum of Positive Numbers: "+sum);
	}

}
