package Recursion;

import java.util.Scanner;

/**
 * FindBinary
 */
public class FindBinary {

    public static void main(String[] args) {
        // take num input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(findBinary(num, ""));
    }

    static String findBinary(int i, String string) {
        if (i == 0) {
            return string;
        }
        string = i % 2 + string;
        return findBinary(i / 2, string);
    }
}