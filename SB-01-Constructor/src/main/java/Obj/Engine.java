package Obj;

public class Engine {
	private int cc;
	
	public Engine(int cc) {
		super();
		this.cc=cc;
	}
	
	public int getcc() {
		return cc;
	}

	public void start() {
		System.out.println("engine started");
	}

}
