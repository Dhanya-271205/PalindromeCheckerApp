/**
 * PalindromeChecker App - UC13
 * Performance Comparison of various algorithms.
 */
public class PalindromCheckerApp {

    public static void main(String[] args) {
        System.out.println("--- Palindrome Performance Benchmark ---");

        String testInput = "A man a plan a canal Panama".toLowerCase().replaceAll("[^a-z0-9]", "");

        // 1. Measure String Reversal (UC3 logic)
        long start1 = System.nanoTime();
        isPalindromeReversal(testInput);
        long end1 = System.nanoTime();
        System.out.println("String Reversal Time: " + (end1 - start1) + " ns");

        // 2. Measure Two-Pointer Approach (UC4 logic)
        long start2 = System.nanoTime();
        isPalindromeTwoPointer(testInput);
        long end2 = System.nanoTime();
        System.out.println("Two-Pointer Time:     " + (end2 - start2) + " ns");

        // 3. Measure Recursion (UC9 logic)
        long start3 = System.nanoTime();
        isPalindromeRecursive(testInput);
        long end3 = System.nanoTime();
        System.out.println("Recursion Time:       " + (end3 - start3) + " ns");
    }

    // UC3 Method
    public static boolean isPalindromeReversal(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // UC4 Method
    public static boolean isPalindromeTwoPointer(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    // UC9 Method
    public static boolean isPalindromeRecursive(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindromeRecursive(s.substring(1, s.length() - 1));
    }
}