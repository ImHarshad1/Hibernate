package SingletonPattern;

class Accountt{
	private static Accountt obj;
	
	private Accountt() {
		System.out.println("Account Created");
	}
	
	public static void create() {
		if(obj == null) {
			obj = new Accountt();
		}else {
			System.out.println("Account Already Exists");
		}
	}
}

public class Bank {
	public static void main(String[] args) {
		
	Accountt.create();
	Accountt.create();
	}
}
