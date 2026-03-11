import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string [cite: 38]
        String input = "level"; [cite: 39]

        // Create a LinkedList to store characters [cite: 40, 41]
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list [cite: 42, 43]
        for (char c : input.toCharArray()) { [cite: 44]
            list.add(c);
        }

        // Flag to track palindrome state [cite: 45]
        boolean isPalindrome = true; [cite: 46]

        // Compare until only one or zero elements remain [cite: 47, 48]
        while (list.size() > 1) {
            // Remove from both ends: removeFirst() and removeLast() [cite: 23, 24, 25]
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print results as shown in output requirements
        System.out.println("Input: " + input); [cite: 50]
        System.out.println("Is Palindrome?: " + isPalindrome); [cite: 51]
    }
}
