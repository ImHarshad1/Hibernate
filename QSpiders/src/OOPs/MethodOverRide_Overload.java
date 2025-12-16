package OOPs;

		class pitaji{
			void land() {
				System.out.println("100 Acre land");
			}
		}
		class beta extends pitaji{
			@Override
			void land() {
				System.out.println("80 Acre land");
			}
			void land(double d) {
				System.out.println("5 Acre Land near Airport");
			}
		}
public class MethodOverRide_Overload {

	public static void main(String[] args) {
		beta b1=new beta();
		b1.land();
		b1.land(10.2);
	}

}
