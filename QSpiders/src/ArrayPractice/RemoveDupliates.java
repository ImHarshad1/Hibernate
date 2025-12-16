package ArrayPractice;

public class RemoveDupliates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        int n = arr.length;

        // Call the remove method and get the new length
        int newLength = removeDuplicates(arr, n);

        // Print the modified array
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to remove duplicates from a sorted array
    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 0; // Index of the last unique element

        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j]; // Update the next unique position
            }
        }
        return i + 1; // Return the new length of the array
    }
}
