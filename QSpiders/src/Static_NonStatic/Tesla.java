package Static_NonStatic;

class EV{
	int a=420;
	void info() {
		System.out.println("Driving Tesla.........");
	}
}

public class Tesla {

	public static void main(String[] args) {
		EV e1=new EV();
		System.out.println(e1.a);
		e1.info();
		System.out.println("=============");
		EV e2=new EV();
		e2.a=100;
		System.out.println(e2.a);
		e2.info();
	}

}
