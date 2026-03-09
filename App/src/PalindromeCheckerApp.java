import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        // Remove spaces and convert to lowercase
        text = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker ===");
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ It is a palindrome.");
        } else {
            System.out.println("❌ It is not a palindrome.");
        }

        scanner.close();
    }
}
