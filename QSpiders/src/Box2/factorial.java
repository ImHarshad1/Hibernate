package Box2;

public class factorial {
	public static long fact(int num) {
//		num = 5;
		int sum = 1;
		
		for (int i=1; i<=num; i++) {
			sum*=i;
			}
		return sum;
	}
	public static void main(String[] args) {
//		int num = 5;
//		int sum = 1;
//		
//		for(int i=1; i<=num;i++) {
//			sum = sum*i;
//		}
//		System.out.println("sum "+sum);
		
			System.out.println("Sum is: "+fact(5));
		}
	}
