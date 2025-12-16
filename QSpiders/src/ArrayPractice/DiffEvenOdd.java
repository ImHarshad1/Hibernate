package ArrayPractice;

public class DiffEvenOdd {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int even=0;
		int odd=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				even+=arr[i];
			}else{
				odd+=arr[i];
			}
		}
		System.out.println("Difference is :"+(even-odd));
	}

}
