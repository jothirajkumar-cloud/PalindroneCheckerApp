public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String text = "radar";

        // Convert string to character array
        char[] charArray = text.toCharArray();

        // Two-pointer initialization
        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two-pointer approach
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}

