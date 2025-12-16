package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("John");
		a.add(22);
		a.add(18);
		a.add("john333@gmail.com");
		a.add(777889098);
		a.add('H');
		a.add("Java Developer");
//		System.out.println(a);
		
//		a.add(1,28);
//		System.out.println(a);
		
//		System.out.println(a.get(3));
//		a.set(0,"John Cena");
//		System.out.println( a.remove(2));
//		System.out.println(a.size());
//		
//		System.out.println(a);
//		a.clear();
//		System.out.println(a);
//		System.out.println(a.isEmpty());
		
		//Fetch only Integers from Object
		for(Object ob:a) {
			if(ob instanceof Integer) {
				int num=(Integer) ob;
				System.out.print(num+" ");
			}
		}
//		System.out.println("\n"+a);
		
		//2nd Way
		ArrayList<Object> a1=new ArrayList<Object>();
//		for(Object ob:a) {
//			if(ob instanceof Integer) {
//				Integer i1=(Integer) ob;
//				a1.add(i1);
//			}
//		}
//		System.out.println(a1);
		
		
//		for (Object ob : a) {
//		    if (ob instanceof Integer) {
//		        a1.add(ob); // Add the actual Integer object
//		    }
//		}
//		System.out.println(a1);

//		Iterator<Object> itr= a.iterator();
//		while(itr.hasNext()) {
//			Object ob=itr.next();
//			if(ob instanceof Integer) {
//				itr.remove();
//				System.out.print(ob+" "); //these are the Removed Integers
//			}
//		}
//		System.out.println("\n"+a);
	}
}
