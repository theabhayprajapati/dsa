package Recursion;

import java.util.Scanner;

/**
 * SumOfNumbers
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        // tak input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(sumOfNumbers(num));
    }

    static int sumOfNumbers(int num) {
        if (num <= 1)
            return num;
        return num + sumOfNumbers(num - 1);
    }
}