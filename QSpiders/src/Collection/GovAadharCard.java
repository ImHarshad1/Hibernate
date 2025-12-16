package Collection;

import java.util.Set;
import java.util.TreeMap;

public class GovAadharCard {

	public static void main(String[] args) {
 		Q_Person p1 = new Q_Person("John", 33, 'M',"11-2-1994");
		Q_Person p2 = new Q_Person("King", 43, 'M',"12-6-1996");
		Q_Person p3 = new Q_Person("Bobby",23, 'M',"13-9-1999");
		Q_Person p4 = new Q_Person("Virat",18, 'M',"14-4-1991");
		Q_Person p5 = new Q_Person("Rohit",43, 'M',"15-8-1990");
		Q_Person p6 = new Q_Person("Dhoni",93, 'M',"16-4-1999");

		TreeMap<Object, Q_Person> t = new TreeMap<Object, Q_Person>(); 
		t.put(20, p1);
		t.put(15, p2);
		t.put(50,new Q_Person("Bobby",23, 'M',"13-9-1999"));
		t.put(55, p4);
		t.put(10, p5);
		t.put(69, p6);
	
		Set<Object> s = t.keySet();
		for(Object i:s) {
			System.out.println(i + " --> " + t.get(i));
		}
	}

}
