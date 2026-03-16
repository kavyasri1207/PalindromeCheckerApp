import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        System.out.println("\nComparing Front and Rear elements:");

        // Compare front and rear until deque is empty or has one element
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            System.out.println("Front: " + front + " | Rear: " + rear);

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        System.out.println("\nResult:");
        if (isPalindrome) {
            System.out.println("The word is a Palindrome.");
        } else {
            System.out.println("The word is NOT a Palindrome.");
        }

        scanner.close();
    }
}
