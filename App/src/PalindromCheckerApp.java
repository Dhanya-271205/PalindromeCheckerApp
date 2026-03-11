import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * PalindromeChecker App - UC6
 * Comparison of Queue (FIFO) and Stack (LIFO).
 */
public class PalindromeApp {

    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (Queue + Stack) ---");

        String input = "deified";

        // Queue follows FIFO (First In First Out)
        Queue<Character> queue = new LinkedList<>();
        // Stack follows LIFO (Last In First Out)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {
            // Dequeue gets the first char, Pop gets the last char
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + input + "' is NOT a Palindrome.");
        }
    }
}