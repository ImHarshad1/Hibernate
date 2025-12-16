package Collection;
import java.util.*;

public class MasterCollections {

	public static void main(String[] args) {
		// -----------------------------
        // 1. Array → List
        // -----------------------------
        Integer[] array = {5, 2, 9, 1, 7};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);

        // Reverse
        Collections.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Sort
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // -----------------------------
        // For int[] (primitive array) & For Integer[] (object array)
        // -----------------------------
        int[] arr = {1, 2, 3};

        ArrayList<Integer> aList = new ArrayList<>();
        for (int n : arr) aList.add(n);
        System.out.println("\nint[]-> "+aList);
        HashSet<Integer> aSet = new HashSet<>(aList);
        LinkedList<Integer> aQueue = new LinkedList<>(aList);
        
        Integer[] ar1 = {1, 2, 3};

        ArrayList<Integer> aaList = new ArrayList<>(Arrays.asList(ar1));
        System.out.println("Integer[]-> "+aaList);
        HashSet<Integer> aaSet = new HashSet<>(Arrays.asList(ar1));
        LinkedList<Integer> aaQueue = new LinkedList<>(Arrays.asList(ar1));

        // -----------------------------
        // 2. List → LinkedList
        // -----------------------------
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(array));
        System.out.println("\nLinkedList: " + linkedList);

        Collections.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);


        // -----------------------------
        // 3. List → Vector
        // -----------------------------
        Vector<Integer> vector = new Vector<>(Arrays.asList(array));
        System.out.println("\nVector: " + vector);

        Collections.reverse(vector);
        System.out.println("Reversed Vector: " + vector);

        Collections.sort(vector);
        System.out.println("Sorted Vector: " + vector);


        // -----------------------------
        // 4. List → Stack
        // -----------------------------
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(array));
        System.out.println("\nStack: " + stack);

        Collections.reverse(stack);
        System.out.println("Reversed Stack: " + stack);

        Collections.sort(stack);
        System.out.println("Sorted Stack: " + stack);


        // -----------------------------
        // 5. List → HashSet / LinkedHashSet / TreeSet
        // -----------------------------
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(array)); // auto sorted

        System.out.println("\nHashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet (sorted auto): " + treeSet);

        // NOTE: Cannot reverse a Set (no order)
        // But you CAN convert Set → List and reverse
        ArrayList<Integer> setToList = new ArrayList<>(hashSet);
        Collections.reverse(setToList);
        System.out.println("HashSet → List → reversed: " + setToList);
        
        ArrayList<Integer> setToListt = new ArrayList<>(treeSet);
        Collections.reverse(setToListt);
        System.out.println("TreeSet → List → reversed: " + setToListt);
        Collections.sort(setToList);
        System.out.println("TreeSet → List → Sort: " + setToListt);


        // -----------------------------
        // 6. List → Queue
        // -----------------------------
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(array));
        Queue<Integer> queueLL = new LinkedList<>(arrayList);
        Queue<Integer> queueAD = new ArrayDeque<>(arrayList);
        PriorityQueue<Integer> queuePQ = new PriorityQueue<>(arrayList); // auto-min-heap sorted

        System.out.println("\nLinkedList Queue: " + queueLL);
        System.out.println("ArrayDeque Queue: " + queueAD);
        System.out.println("PriorityQueue (auto-sorted): " + queuePQ);

        // Reverse queue by converting to list
        ArrayList<Integer> qToList = new ArrayList<>(queueLL);
        Collections.reverse(qToList);
        System.out.println("Queue reversed (through list): " + qToList);


        // -----------------------------
        // 7. Map Conversions
        // -----------------------------
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        TreeMap<Integer, String> treeMap = new TreeMap<>(map);  // auto sorted by key
        LinkedHashMap<Integer, String> LhMap = new LinkedHashMap<>(map);
        Hashtable<Integer, String> hashTable = new Hashtable<>(map);

        System.out.println("\nHashMap: " + map);
        System.out.println("TreeMap (sorted by key): " + treeMap);
        System.out.println("LinkedHashMap: " + LhMap);
        System.out.println("Hashtable: " + hashTable);

        // Cannot reverse maps directly — convert Keys to List
        ArrayList<Integer> mapKeys = new ArrayList<>(map.keySet());
        Collections.reverse(mapKeys);
        System.out.println("\nMap Keys reversed: " + mapKeys);
        
        Set<Integer> s1 =map.keySet();
        for(int i:s1) {
        	System.out.println(i+"->"+map.get(i));
        }

        Collections.sort(mapKeys);
        System.out.println("Map Keys sorted: " + mapKeys);


        // -----------------------------
        // 8. Complete Cross Conversion Example
        // -----------------------------
        System.out.println("\n*** CROSS CONVERSION ***");

        ArrayList<Integer> l1 = new ArrayList<>(arrayList);
        HashSet<Integer> s11 = new HashSet<>(l1);
        LinkedList<Integer> q1 = new LinkedList<>(s1);
        ArrayList<Integer> l2 = new ArrayList<>(q1);

        System.out.println("List → Set → Queue → List: " + l2);

	}

}
