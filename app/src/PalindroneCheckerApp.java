import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // Choose strategy at runtime (can be changed dynamically)
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        // Using Stack Strategy
        System.out.println("Using Stack Strategy:");
        printResult(text, stackStrategy);

        // Using Deque Strategy
        System.out.println("\nUsing Deque Strategy:");
        printResult(text, dequeStrategy);
    }

    // Helper method
    public static void printResult(String text, PalindromeStrategy strategy) {
        boolean result = strategy.checkPalindrome(text);

        if (result) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String text);
}

// Stack-based implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String text) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

