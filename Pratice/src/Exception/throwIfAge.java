package Exception;

class InvalidAgeException extends Exception{
	 public InvalidAgeException(String msg){
	        super(msg);
	    }
}
//Q2. Write a custom exception InvalidAgeException and throw it if age < 18.
public class throwIfAge {

	public static void main(String[] args) {
		int age= 15;
		try {
			if(age<18) {
				throw new InvalidAgeException("Age must be 18+");
				}
			System.out.println("Eligible"); 
			} catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
		}
	}
}
