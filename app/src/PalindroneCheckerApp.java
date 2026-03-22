public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String text = "A man a plan a canal Panama";

        // Step 1: Normalize the string
        // Remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
} 

