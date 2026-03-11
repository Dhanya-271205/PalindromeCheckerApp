/**
 * PalindromeChecker App - UC12
 * Uses the Strategy Pattern to switch algorithms dynamically.
 */

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean check(String text);
}

// 2. Implementation A: Stack Strategy (from UC5)
class StackStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (char c : clean.toCharArray()) stack.push(c);
        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()) rev.append(stack.pop());
        return clean.equals(rev.toString());
    }
}

// 3. Implementation B: Deque Strategy (from UC7)
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (char c : clean.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// 4. The Context (The Service that uses a strategy)
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String text) {
        return strategy.check(text);
    }
}

public class PalindromCheckerApp {
    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (Strategy Pattern) ---");

        PalindromeContext context = new PalindromeContext();
        String test = "Level";

        // Dynamically choose Stack Strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(test));

        // Dynamically switch to Deque Strategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " + context.executeStrategy(test));
    }
}