import java.util.ArrayDeque;
import java.util.Deque;

/**
 * PalindromeChecker App - UC7
 * Optimized check using a Deque (Double-Ended Queue).
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (Deque Method) ---");

        String input = "racecar";

        // UC7: Initialize a Deque
        // ArrayDeque is a highly efficient implementation of the Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // 1. Insert all characters into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // 2. Comparison Logic: Remove from both ends simultaneously
        // A palindrome must have matching front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Display Result
        if (isPalindrome) {
            System.out.println("The word '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The word '" + input + "' is NOT a Palindrome.");
        }
    }
}