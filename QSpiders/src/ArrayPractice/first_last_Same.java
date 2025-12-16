package ArrayPractice;

public class first_last_Same {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30 ,40,10,10};
		int count =0;
		boolean res=false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				 if(arr[i]==arr[j]) {
					 int target=10;
					 System.out.println("Duplicate Element is: "+arr[i]);
					 {
						 if(arr[i]==target) {
							 count++;
							 System.out.println(count);
						 }
					 }
					 res=true;
					 break;
				 }
			}
		}
		if(res==false) {
			System.out.println("Duplicate element is found: ");
		}
		
		//2nd Way 
		//This approach Gives Ans only for 1st & Last Element
		
//		if(arr[0]==arr[arr.length-1]) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
	}
}
