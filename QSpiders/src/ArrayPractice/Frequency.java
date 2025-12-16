package ArrayPractice;

public class Frequency {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,2,5};
		int count=2;
		int target=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==count) {
				target++;
			}
		}
		System.out.println(target);
	}

}
