package Static_NonStatic;

public class Non_staticBlock {
	
	{
		System.out.println("Non-static block 1");
	}
	{
		System.out.println("Non-statoc block 2");
	}
	public static void main(String[] args) {
		System.out.println("satrt");
		Non_staticBlock n1=new Non_staticBlock();
		System.out.println("=================");
		Non_staticBlock n2=new Non_staticBlock();
	}
	{
		System.out.println("Non-static block 3");
	}
}
