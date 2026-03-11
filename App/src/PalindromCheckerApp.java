/**
 * PalindromeChecker App - UC8
 * Uses a Singly Linked List with mid-point reversal.
 */
public class PalindromCheckerApp {

    // Helper Node class for the Singly Linked List
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; }
    }

    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker v1.0 (Linked List) ---");
        String input = "level";

        // 1. Convert string to Singly Linked List
        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        // 2. Find the middle using Fast and Slow pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse the second half of the list in-place
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // 4. Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev; // 'prev' is the new head of the reversed half
        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println("The word '" + input + "' is a Palindrome: " + isPalindrome);
    }
}