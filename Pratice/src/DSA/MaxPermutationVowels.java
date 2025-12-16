package DSA;

import java.util.Arrays;

public class MaxPermutationVowels {

    static int maxPermutationAfterRemainingVowels(String s) {
        // Remove vowels
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        // Keep only digits
        String digitsOnly = sb.toString().replaceAll("[^0-9]", "");
        if (digitsOnly.isEmpty()) {
            return 0; // No digits left
        }
        // Convert to char array and sort
        char[] arr = digitsOnly.toCharArray();
        Arrays.sort(arr);
        
        // Reverse sorted array to get max permutation
        String reversed = new StringBuilder(new String(arr)).reverse().toString();

        // Parse as integer
        return Integer.parseInt(reversed);      
}
   
    public static void main(String[] args) {
    	String input1 = "hello123";
        String input2 = "aeiou987";
        String input3 = "world56";

        System.out.println("Input: " + input1 + " → " + maxPermutationAfterRemainingVowels(input1));
        System.out.println("Input: " + input2 + " → " + maxPermutationAfterRemainingVowels(input2));
        System.out.println("Input: " + input3 + " → " + maxPermutationAfterRemainingVowels(input3));

    }
}