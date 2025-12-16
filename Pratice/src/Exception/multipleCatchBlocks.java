package Exception;

//Q3. Write a program with multiple catch blocks (ArrayIndexOutOfBounds and NullPointerException).

public class multipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int[] a =null;
			 System.out.println(a[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index Array");
		}catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}

	}

}
