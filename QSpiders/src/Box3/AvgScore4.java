package Box3;

public class AvgScore4 {
	public static double avg(double a, double b, double c) {
		double s=((a+b+c)/3);
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		double s = avg(50,80,18);
		System.out.println("Average Score is ");
		
		if(s>0 && s<=50) {
			System.out.println("Average is Normal");
			System.out.println(" ");
		}
		else if(s>50 && s<=100) {
			System.out.println("Average is Good");
			System.out.println(" ");
		}
		else if(s>100 && s<=180) {
			System.out.println("Average is Excellent");
			System.out.println(" ");
		}
		else {
			System.out.println("Avg is not define");
		}
	}

}