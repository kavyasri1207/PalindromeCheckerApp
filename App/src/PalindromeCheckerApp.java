import java.util.Scanner;
import java.util.Stack;

// Encapsulated class handling palindrome logic
class PalindromeChecker {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare original string with stack pop
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("The input is a Palindrome.");
        } else {
            System.out.println("The input is NOT a Palindrome.");
        }

        scanner.close();
    }
}
