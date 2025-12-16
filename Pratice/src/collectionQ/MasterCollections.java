package collectionQ;

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
        // 2. List → LinkedList
        // -----------------------------
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        System.out.println("\nLinkedList: " + linkedList);

        Collections.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);


        // -----------------------------
        // 3. List → Vector
        // -----------------------------
        Vector<Integer> vector = new Vector<>(arrayList);
        System.out.println("\nVector: " + vector);

        Collections.reverse(vector);
        System.out.println("Reversed Vector: " + vector);

        Collections.sort(vector);
        System.out.println("Sorted Vector: " + vector);


        // -----------------------------
        // 4. List → Stack
        // -----------------------------
        Stack<Integer> stack = new Stack<>();
        stack.addAll(arrayList);
        System.out.println("\nStack: " + stack);

        Collections.reverse(stack);
        System.out.println("Reversed Stack: " + stack);

        Collections.sort(stack);
        System.out.println("Sorted Stack: " + stack);


        // -----------------------------
        // 5. List → HashSet / LinkedHashSet / TreeSet
        // -----------------------------
        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
        TreeSet<Integer> treeSet = new TreeSet<>(arrayList); // auto sorted

        System.out.println("\nHashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet (sorted auto): " + treeSet);

        // NOTE: Cannot reverse a Set (no order)
        // But you CAN convert Set → List and reverse
        ArrayList<Integer> setToList = new ArrayList<>(hashSet);
        Collections.reverse(setToList);
        System.out.println("HashSet → List → reversed: " + setToList);


        // -----------------------------
        // 6. List → Queue
        // -----------------------------
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
        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<>(map);
        Hashtable<Integer, String> hashTable = new Hashtable<>(map);

        System.out.println("\nHashMap: " + map);
        System.out.println("TreeMap (sorted by key): " + treeMap);
        System.out.println("LinkedHashMap: " + lhMap);
        System.out.println("Hashtable: " + hashTable);

        // Cannot reverse maps directly — convert Keys to List
        ArrayList<Integer> mapKeys = new ArrayList<>(map.keySet());
        Collections.reverse(mapKeys);
        System.out.println("Map Keys reversed: " + mapKeys);

        Collections.sort(mapKeys);
        System.out.println("Map Keys sorted: " + mapKeys);


        // -----------------------------
        // 8. Complete Cross Conversion Example
        // -----------------------------
        System.out.println("\n*** CROSS CONVERSION ***");

        ArrayList<Integer> l1 = new ArrayList<>(arrayList);
        HashSet<Integer> s1 = new HashSet<>(l1);
        LinkedList<Integer> q1 = new LinkedList<>(s1);
        ArrayList<Integer> l2 = new ArrayList<>(q1);

        System.out.println("List → Set → Queue → List: " + l2);

	}

}
