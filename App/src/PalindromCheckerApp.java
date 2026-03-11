/**
 * PalindromeChecker App - UC10
 * Normalizes input to ignore case, spaces, and non-alphanumeric characters.
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (Robust Preprocessing) ---");

        // Test string with mixed case and spaces
        String input = "A man a plan a canal Panama";

        // UC10: Normalization
        // 1. Convert to lowercase
        // 2. Use Regular Expression (Regex) to replace all non-alphanumeric characters with nothing
        // [^a-zA-Z0-0] means "anything that is NOT a letter or a number"
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println("Original:  " + input);
        System.out.println("Normalized: " + normalized);

        // Check using simple reversal (or any previous technique)
        String reversed = new StringBuilder(normalized).reverse().toString();

        if (normalized.equals(reversed)) {
            System.out.println("RESULT: Success! It is a palindrome.");
        } else {
            System.out.println("RESULT: Failure! Not a palindrome.");
        }
    }
}