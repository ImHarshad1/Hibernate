package SingletonPattern;

class dbConnection{
	private static dbConnection db;

	private dbConnection() {
		System.out.println("Connecting to Database...");
	}
	
	public static dbConnection getInsatnce() {
		if(db == null) {
			synchronized(dbConnection.class) {
				if(db == null) {
					db = new dbConnection();
				}
			}
		}
		return db;
	}
	
	public void query(String sql) {
		System.out.println("Executing : " + sql);
	}
}


public class DatabaseTest {

	public static void main(String[] args) {
		
		dbConnection db1 = dbConnection.getInsatnce();
		dbConnection db2 = dbConnection.getInsatnce();
	
		db1.query("SELECT * FROM users");
        db2.query("UPDATE users SET name='Reacher' WHERE id=1");

        System.out.println(db1 == db2);  // true → same instance
        

	}

}
