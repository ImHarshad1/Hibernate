package ArrayPractice;

public class MaxWealth2D {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{2,3,4}};
		int ans=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
			}
			if(sum>ans) {
				ans=sum;
			}
		}
		System.out.println(ans);

	}

}
