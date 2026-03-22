import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // Warm-up (optional for JVM optimization)
        new StackStrategy().checkPalindrome(text);
        new DequeStrategy().checkPalindrome(text);
        new LoopStrategy().checkPalindrome(text);

        // Measure Stack Strategy
        long start1 = System.nanoTime();
        boolean r1 = new StackStrategy().checkPalindrome(text);
        long end1 = System.nanoTime();

        // Measure Deque Strategy
        long start2 = System.nanoTime();
        boolean r2 = new DequeStrategy().checkPalindrome(text);
        long end2 = System.nanoTime();

        // Measure Loop Strategy (two-pointer)
        long start3 = System.nanoTime();
        boolean r3 = new LoopStrategy().checkPalindrome(text);
        long end3 = System.nanoTime();

        // Print results
        System.out.println("Palindrome Check: " + text + "\n");

        System.out.println("Stack Strategy Result: " + r1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Strategy Result: " + r2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Loop Strategy Result  : " + r3 + " | Time: " + (end3 - start3) + " ns");
    }
}

// Strategy 1: Stack
class StackStrategy {
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

// Strategy 2: Deque
class DequeStrategy {
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

// Strategy 3: Two-pointer Loop
class LoopStrategy {
    public boolean checkPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

