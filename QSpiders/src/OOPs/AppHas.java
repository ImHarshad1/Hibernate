package OOPs;

public class AppHas {
	public static void main(String[] args) {
		Has_Course c1=new Has_Course("java",8000,"2 Month");
		Has_Course c2=new Has_Course("Python",4000,"1 Month");
		
		Has_Course course[]=new Has_Course[2];
		course[0]=c1;
		course[1]=c2;
		
		for(int i=0; i<course.length; i++) {
			course[i].displycourse();
			System.out.println("================");
		}
	}
}
