import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";

        // Normalize for better results (optional but recommended for UC12)
        String normalized = input.toLowerCase();

        // Using Strategy Pattern to select algorithm at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(normalized);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }

}