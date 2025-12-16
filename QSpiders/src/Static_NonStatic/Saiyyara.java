package Static_NonStatic;

public class Saiyyara {

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(Ashiqui.a);
		new Ashiqui().sing();
		System.out.println("Main End");
	}
}