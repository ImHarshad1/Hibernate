package ArrayPractice;

public class RevatEvenIndex {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		//find all even indexes
		int start=0;
		//if length is even the -2 if length is odd we do -1
		int end=(arr.length%2==0)?arr.length-2:arr.length-1; 
		//here,length=6 means condition 1 length-2 will execute 
		//end=4
		
		//swap elements at even indexes
		while(start<end) {					//0 is less than 4
			int temp=arr[start]; 			//temp=10
			 arr[start]=arr[end]; 			//start=50
			 arr[end]=temp;					//end=10
			 //iteration to chek next even index
			 start+=2;						//now start=2
			 end-=2;						//end=2 bcz first end=4 4-2=2
		}
	    for (int val:arr) {
	        System.out.print(val + " ");
	    }
	}

}
