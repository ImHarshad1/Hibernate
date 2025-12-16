package Test;

public class Nested_do {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("Harsh");
			i++;
			
			int j=1;
		do {
			System.out.println("Harshad");
			j++;
		}
		while(j<=10);
		}while(i<=10);
	}

}
