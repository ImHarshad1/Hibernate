package ArrayPractice;

public class MissingNo1toN {

	public static void main(String[] args) {
		int[] arr={1,2,4,6,3,7,8};
		int sum1=0;
		int n=arr.length+1;//use +1 to get last element
		int sum2=n*(n+1)/2;
		
		for(int i=0;i<arr.length; i++) {
			sum1+=arr[i];
		}
		System.out.println("Missing Element is: "+(sum2-sum1));
	}

}
