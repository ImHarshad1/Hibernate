package OOPs;

	class champaklal{
		champaklal(char ch,double d){
			System.out.println(ch+" "+d+" 1.Inside Champaklal");
		}
	}
	class Jethalal extends champaklal{
		Jethalal(String s){
			super('A',55.55);
			System.out.println(s+" 2.Inside jethalal");
		}
	}
	class taappu extends Jethalal{
		taappu(int a, int b){
			super("Cycle");
			System.out.println(a+" "+b+" 3. inside Tappu");
		}
	}
	
public class TMKOC {
	public static void main(String[] args) {
		champaklal c1=new champaklal('h',55.50);
		System.out.println("==================");
		Jethalal j1=new Jethalal("Jethiyaaaaaa");
		System.out.println("===================");
		taappu t1=new taappu(10,12);
		}
}
