import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC8: LinkedList Based Palindrome Checker ===");
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Convert input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Create LinkedList of Characters
        LinkedList<Character> charList = new LinkedList<>();

        // Add characters to LinkedList
        for (char ch : input.toCharArray()) {
            charList.add(ch);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (charList.size() > 1) {
            char first = charList.removeFirst();
            char last = charList.removeLast();

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