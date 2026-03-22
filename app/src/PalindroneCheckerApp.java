public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // Create object of PalindromeChecker service
        PalindromeChecker checker = new PalindromeChecker();

        // Call service method
        boolean result = checker.checkPalindrome(text);

        // Display result
        if (result) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}

// PalindromeChecker class (Encapsulation + Single Responsibility)
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String text) {

        // Internal logic using array (data structure)
        char[] arr = text.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
