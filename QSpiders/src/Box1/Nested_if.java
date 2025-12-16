package Box1;

public class Nested_if {

	public static void main(String[] args) {
		String email = "harshad123@gmail.com";
		int pass = 12347;
		
		if(email == "harshad123@gmail.com")
		{
			if(pass == 12345)
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Email");
		}
}

}
