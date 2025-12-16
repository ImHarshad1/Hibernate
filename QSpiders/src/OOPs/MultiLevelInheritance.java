package OOPs;

	class granny{
		void pyar(){
			System.out.println("Dadi ka pyarr...");
		}
	}
	class mom extends granny{
		void care() {
			System.out.println("Caring...");
		}
	}
	class beti extends mom{
		void kalesh() {
			System.out.println("Paisa Mangna...");
		}
	}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		System.out.println("Start");
		granny g1=new granny();
		g1.pyar();
//		g1.care();
//		g1.kalesh();
		System.out.println("=============");
		mom m1=new mom();
		m1.pyar();
		m1.care();
//		m1.kalesh();//CTE
		
		
		System.out.println("=============");
		beti b1=new beti();
		b1.care();
		b1.kalesh();
		b1.pyar();
		
	}

}
