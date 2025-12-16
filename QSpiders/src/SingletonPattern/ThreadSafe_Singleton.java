package SingletonPattern;

class account{
	private static account obj;
	
	private account() {
		System.out.println("Account Created");
	}
	
	public static synchronized account getInstance() {
		if(obj==null) {
			obj = new account();
		}else {
			System.out.println("Account Already Exists...");
		}
		return obj;
	}
}


public class ThreadSafe_Singleton {

	public static void main(String[] args) {
		account a1 = account.getInstance();
		account a2 = account.getInstance();
		account a3 = account.getInstance();
		
		System.out.println(a1 == a2);
		System.out.println(a2 == a3);
		
	}
}
