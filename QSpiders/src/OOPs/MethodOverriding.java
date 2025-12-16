package OOPs;

	 class father{
		void house() {
			System.out.println("3 Floor Building");
		}
	}
	 class son extends father{
		@Override
		void house() {
			System.out.println("4 Floor Building ");
		}
	}

public class MethodOverriding {

	public static void main(String[] args) {
		son s1=new son();
		s1.house();
	}

}
