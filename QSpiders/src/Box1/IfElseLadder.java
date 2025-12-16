package Box1;

public class IfElseLadder {

	public static void main(String[] args) {
		char gen = 'f';
		if(gen == 'M' || gen == 'm')
		{
			System.out.println("Gender is Male");
		}
		else if(gen == 'F' || gen == 'f')
		{
			System.out.println("Gnder is female");
		}
		else if(gen == 'O' || gen == 'o')
		{
			System.out.println("Gender is Other");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
