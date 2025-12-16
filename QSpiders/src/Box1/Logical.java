package Box1;

public class Logical {

	public static void main(String[] args) {
		int a = 20;
		int b = 18;
		System.out.println(a>b && b<='Z');
		System.out.println('A' == 65 || (40+60)>=10);
		System.out.println("Krishna" == "krishna" && 70==70);
		System.out.println(55.55>55.52 || 'Z'==500);
		
		System.out.println("--------------------");
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || ('Z'==122));
		System.out.println((5*60/5+30/5+25<=2500) && (60*2) <= 80);
		System.out.println(500*2+30/5+2000>=15000 || 90 == 'Z');
		
	}

}
