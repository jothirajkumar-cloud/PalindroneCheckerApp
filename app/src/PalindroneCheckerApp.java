public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String text, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call for next inner characters
        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Original string
        String text = "racecar";

        // Call recursive method
        boolean result = isPalindrome(text, 0, text.length() - 1);

        // Display result
        if (result) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
