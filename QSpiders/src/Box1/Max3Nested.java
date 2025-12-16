package Box1;

public class Max3Nested {

	public static void main(String[] args) {
		int a = 25, b = 200, c = 102;
		if(a > b)
		{
			if(a > c)
			{
			System.out.println("a is Greatest");
			}
			else
			{
				System.out.println("b is greatest");
			}
		}
		else
		{
			System.out.println("c is greatest");
		}
	}

}
