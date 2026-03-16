import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Compare characters from both ends
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The phrase is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The phrase is NOT a Palindrome.");
        }

        scanner.close();
    }
}