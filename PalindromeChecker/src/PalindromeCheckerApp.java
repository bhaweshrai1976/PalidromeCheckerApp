import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        System.out.println("Input: " + input);

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

      System.out.println("Is Palindrome ? :" + isPalindrome);
    }
}