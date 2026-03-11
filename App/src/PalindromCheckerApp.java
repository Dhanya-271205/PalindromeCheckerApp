import java.util.Stack;

/**
 * PalindromeChecker App - UC5
 * Demonstrates the use of the Stack data structure (LIFO).
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
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
    }
}