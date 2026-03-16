import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char c : input.toCharArray()) {
            queue.add(c);      // Enqueue (FIFO)
            stack.push(c);     // Push (LIFO)
        }

        boolean isPalindrome = true;

        System.out.println("\nComparing Dequeue (Queue) vs Pop (Stack):");

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            System.out.println("Queue Dequeue: " + fromQueue +
                    " | Stack Pop: " + fromStack);

            if (fromQueue != fromStack) {
                isPalindrome = false;
            }
        }

        System.out.println("\nResult:");
        if (isPalindrome) {
            System.out.println("The word is a Palindrome.");
        } else {
            System.out.println("The word is NOT a Palindrome.");
        }

        scanner.close();
    }
}
