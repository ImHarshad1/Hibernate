package DSA;
import java.util.*;

public class EvenOddDigit {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String N = sc.next();   // read number as string

	        List<Integer> oddDigits = new ArrayList<>();
	        int product = 1;
	        boolean hasNonZeroEven = false;

	        // Step 1: separate odd/even positions
	        for (int i = 0; i < N.length(); i++) {
	            int digit = N.charAt(i) - '0';
	            int pos = i + 1; // position starting from 1

	            if (pos % 2 == 1) {           // odd position
	                oddDigits.add(digit);
	            } else {                      // even position
	                if (digit != 0) {
	                    product *= digit;
	                    hasNonZeroEven = true;
	                }
	            }
	        }

	        // If all even digits were zero, product must be 1
	        if (!hasNonZeroEven) {
	            product = 1;
	        }

	        // Step 2: collect odd digits that divide product
	        List<Integer> result = new ArrayList<>();
	        for (int d : oddDigits) {
	            if (d != 0 && product % d == 0) {
	                result.add(d);
	            }
	        }

	        // Step 3: output formatting
	        if (result.isEmpty()) {
	            System.out.println("(0)");
	        } else {
	            Collections.sort(result);
	            System.out.print("(");
	            for (int i = 0; i < result.size(); i++) {
	                System.out.print(result.get(i));
	                if (i != result.size() - 1) System.out.print(",");
	            }
	            System.out.println(")");
	        }
	    }
}