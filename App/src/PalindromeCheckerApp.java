import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkUsingArray(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkUsingStack(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Recursion
    public static boolean checkUsingRecursion(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return checkUsingRecursion(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Method 1 timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingArray(input);
        long end1 = System.nanoTime();

        // Method 2 timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        // Method 3 timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingRecursion(normalized, 0, normalized.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("\nPalindrome Results:");
        System.out.println("Array Method: " + result1);
        System.out.println("Stack Method: " + result2);
        System.out.println("Recursion Method: " + result3);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Array Method Time: " + (end1 - start1));
        System.out.println("Stack Method Time: " + (end2 - start2));
        System.out.println("Recursion Method Time: " + (end3 - start3));

        scanner.close();
    }
}
