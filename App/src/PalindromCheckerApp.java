/**
 * PalindromeChecker App - UC11
 * Uses Encapsulation to provide a reusable Palindrome Service.
 */

// 1. The Service Class (Encapsulation)
class PalindromeService {

    /**
     * Public method to expose logic to other parts of the app.
     * This method handles normalization and validation.
     */
    public boolean checkPalindrome(String text) {
        if (text == null) return false;

        // Internal logic hidden from the user
        String cleanText = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleanText).reverse().toString();

        return cleanText.equals(reversed);
    }
}

// 2. The Main Application Class
public class PalindromCheckerApp {

    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (OOP Design) ---");

        // Instantiate the service object
        PalindromeService service = new PalindromeService();

        // Use the service method
        String testCase = "Was it a car or a cat I saw?";
        boolean isPalindrome = service.checkPalindrome(testCase);

        System.out.println("Input: " + testCase);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}