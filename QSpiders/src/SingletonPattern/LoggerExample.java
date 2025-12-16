package SingletonPattern;

class logger{
	private static logger lg;
	
	private logger() {}
	
	public static logger getInstance() {
		if(lg == null) {
			lg = new logger();
		}
		return lg;
	}
	public void log(String msg) {
		System.out.println("[LOG]: " + msg);
	}
}


public class LoggerExample {

	public static void main(String[] args) {

		logger l1 = logger.getInstance();
		logger l2 = logger.getInstance();
		
		l1.log("Application Started ");
		l2.log("User Logged in");
		
		 System.out.println(l1 == l2); // true
	}
}
