package ArrayPractice;

public class MaxDiffBtwn2Elements {

	public static void main(String[] args) {
		int arr[]= {2,1,5,3,7};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
			
		}System.out.println("Maximun Difference Betwwen 2 Elements is: "+(max-min));
	}

}
