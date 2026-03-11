/**
 * PalindromeChecker App - UC2
 * Implements a basic check using a hardcoded string literal.
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("--- Palindrome Checker v1.0 ---");

        // UC2: Hardcoded String Logic
        String original = "madam"; // String Literal

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // Conditional Statement to check equality
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The word '" + original + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}