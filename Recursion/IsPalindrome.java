package Recursion;

import java.util.Scanner;

/**
 * IsPalindrome
 */
public class IsPalindrome {

    public static void main(String[] args) {
        // take string input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        input.close();
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String string) {
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }

        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return isPalindrome(string.substring(1, string.length() - 1));
        }
        return false;
    }
}