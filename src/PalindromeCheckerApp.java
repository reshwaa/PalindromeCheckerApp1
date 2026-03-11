import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");

        String input = scanner.nextLine();

        Deque<Character> deque = new LinkedList<>();

        for(char c : input.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
