package Test;

public class array0 {

	public static void main(String[] args) {
		int arr[]= {0,3,0,5,0,7,9};
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
		for(int val:arr) {
			System.out.print(val +" ");
		}
		
	}

}
