<<<<<<< HEAD
import java.util.Stack;

/**
 * PalindromeChecker App - UC5
 * Demonstrates the use of the Stack data structure (LIFO).
=======
/**
 * PalindromeChecker App - UC9
 * Demonstrates Palindrome check using Recursion.
>>>>>>> UC9
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
<<<<<<< HEAD
        // UC1: Welcome Message
        System.out.println("--- Palindrome Checker v1.0 (Stack Method) ---");

        String input = "radar"; // Hardcoded for logic demonstration

        // UC5: Initializing the Stack data structure
        Stack<Character> stack = new Stack<>();

        // 1. Push Operation: Store characters in the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 2. Pop Operation: Build a reversed string
        // Since Stack is LIFO, popping gives the string in reverse
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // 3. Compare and Display Result
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed.toString());

        if (input.equalsIgnoreCase(reversed.toString())) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
=======
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
>>>>>>> UC9
    }
}