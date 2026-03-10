import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String -> ");
        String input = sc.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call service method
        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Optional normalization (same as UC10)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize pointers
        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}