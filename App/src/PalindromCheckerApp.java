public class PalindromCheckerApp {

    public static void main(String[] args) {
        // Step 1: Initialize the original string literal
        String original = "radar";
        String reversed = ""; // Initializing an empty string to hold the result

        // Step 2: Loop through the original string in reverse order
        // We start at the last index (length - 1) and move to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Creating a new string object in each iteration
            reversed = reversed + original.charAt(i);
        }

        // Step 3: Comparison using .equals()
        // Note: We use .equals() because == compares memory addresses, not text content
        if (original.equals(reversed)) {
            System.out.println("Success! '" + original + "' is a palindrome.");
        } else {
            System.out.println("Failure! '" + original + "' is not a palindrome.");
        }

        System.out.println("Reversed string was: " + reversed);
    }
}