package collectionQ;

import java.util.HashMap;
import java.util.TreeSet;

public class CountFreq_HashMap {

	public static void main(String[] args) {
		String[] s = {"apple","banana","apple","orange","apple","banana","banana","banana"};
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		for(String i : s ) {
			if(h.containsKey(i)) {
				h.put(i, h.get(i) + 1);
			}else {
				h.put(i, 1);
			}
		}
		System.out.println(h + "\n");
		
		TreeSet<String> a =new TreeSet<>(h.keySet());
		for(String b:a) {
			System.out.println(b + " : " + h.get(b));
		}
		
		for(String k:h.keySet()) {
			System.out.println(k + " --> " + h.get(k));
		}
	}
}
//🧩 Step-by-step breakdown
//1️⃣ First iteration — i = "apple"
//Does h contain "apple" yet? → ❌ No (h.containsKey("apple") → false)
//So it goes to the else block:
//h.put("apple", 1);
//→ Add a new entry in the map:
//{apple=1}

//2️⃣ Second iteration — i = "banana"
//"banana" not in map → ❌ false
//So again else runs:
//h.put("banana", 1);
//→ Now map becomes:
//{apple=1, banana=1}

//3️⃣ Third iteration — i = "apple" again
//This time, "apple" already exists → ✅ true
//So it runs this line:
//h.put(i, h.get(i) + 1);

//Let’s unpack that 👇
//h.get(i) → gets the current count of "apple"
//→ h.get("apple") = 1
//h.get(i) + 1 → increments the count by 1
//→ 1 + 1 = 2
//h.put(i, 2) → updates the value for "apple" to 2.
//So now map becomes:
//{apple=2, banana=1}

//4️⃣ Next "orange" → new key → {apple=2, banana=1, orange=1}
//5️⃣ Next "apple" again → existing → increment to 3
//6️⃣ Next "banana" again → increment to 2
//
//✅ Final map:
//
//{apple=3, banana=2, orange=1}

