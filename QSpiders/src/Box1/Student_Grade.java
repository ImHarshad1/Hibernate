package Box1;

public class Student_Grade {

	public static void main(String[] args) {
		char grade = 'b';
		if(grade == 'a' || grade == 'A')
		{
			System.out.println("Excellent");
		}
		else if(grade == 'b' || grade == 'B')
		{
			System.out.println("Good");
		}
		else if(grade == 'c' || grade == 'C')
		{
			System.out.println("Average");
		}
		else if(grade == 'd' || grade == 'D')
		{
			System.out.println("Bad");
		}
		else if(grade == 'f' || grade == 'F')
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Grade");
		}
	}

}
