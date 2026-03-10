import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PallindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC7 : Deque Based Optimized Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}