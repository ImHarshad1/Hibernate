package Search;
import java.util.Arrays;
public class FirstOccurancee {
	
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 7, 8, 8, 7, 7};
        int target = 7;

        // Sort the array
        Arrays.sort(arr);

        // Initialize answer array
        int[] ans = {-1, -1};

        // Search for first occurrence
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans[0] = mid; // Found target
                end = mid - 1; // Continue searching in the left half
            }
        }
        // Search for last occurrence
        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans[1] = mid; // Found target
                start = mid + 1; // Continue searching in the right half
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("First and Last Occurrence: [" + ans[0] + ", " + ans[1] + "]");
       
    }
}
