package OOPs;

public class Has_Course {
	String Coursename;
	double price;
	String Duration;
	
	public Has_Course(String Coursename, double price, String Duration) {
		super();
		this.Coursename = Coursename;
		this.price = price;
		this.Duration = Duration;
	}

	void displycourse() {
		System.out.println("Course Name     : "+Coursename);
		System.out.println("Course Price    : "+price);
		System.out.println("Course Duration : "+Duration);
	}

	public static void main(String[] args) {
		
	}

}
