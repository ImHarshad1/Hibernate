package Box3;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2001;
		boolean res = (year%400 == 0) || (year%4==0 && year%100 != 0);
		if(res) {
			System.out.println(year+" Is Leap");
		}
		else {
			System.out.println(year+" is not prime");
		}

	}

}
