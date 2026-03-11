
public class PalindromCheckerApp {

    // Application metadata constants
    private static final String APP_NAME = "Palindrome Checker";
    private static final String APP_VERSION = "1.0.0";

    /**
     * The JVM invokes this main method to start the program.
     * The 'static' keyword allows it to run without instantiating the class.
     */
    public static void main(String[] args) {
        displayWelcomeMessage();

        // Future Use Cases (UC2, UC3, etc.) will be called here
        System.out.println("\nReady for input processing...");
    }

    /**
     * Method to handle the console output for UC1.
     */
    private static void displayWelcomeMessage() {
        System.out.println("========================================");
        System.out.println("    Welcome to " + APP_NAME);
        System.out.println("    Version: " + APP_VERSION);
        System.out.println("========================================");
        System.out.println("Description: Validates if a string is a palindrome.");
    }
}