package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class D1Q3 {

		public static <T> ArrayList<T> 
		removeDuplicates(ArrayList<T> list){
			
		ArrayList<T> res=new ArrayList<>();
		HashSet<T> hs=new HashSet<>();
		
		for(T e:list) {
			if(hs.add(e)){
				res.add(e);
			}
		}
		return res;	
		}		
		
		public static void main(String[] args) {
			ArrayList<Integer> a=new ArrayList<Integer>();
			a.add(3);
			a.add(5);
			a.add(3);
			a.add(7);
			a.add(5);
			a.add(9);
			
			System.out.println("Input: "+a);
			ArrayList<Integer> a1=removeDuplicates(a); 
			System.out.println("After Remove Duplicates: "+a1);
	}
}