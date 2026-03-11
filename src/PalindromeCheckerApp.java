
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String normalized = input.toLowerCase();

        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(normalized);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }

    private static boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}