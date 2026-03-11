/**
 * PalindromeChecker App - UC9
 * Demonstrates Palindrome check using Recursion.
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (Recursion) ---");

        String input = "malayalam";

        // Initial call to the recursive function
        boolean result = isPalindrome(input);

        System.out.println("The word '" + input + "' is a Palindrome: " + result);
    }

    /**
     * Recursive method to check palindrome logic.
     */
    public static boolean isPalindrome(String str) {
        // Base Condition 1: If string has 0 or 1 characters, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Check if the first and last characters match
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursive Call: Check the substring excluding the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        // Base Condition 2: Characters don't match
        return false;
    }
}