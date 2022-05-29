package Recursion;

import java.util.Scanner;

/**
 * FibonacciNO
 */
public class FibonacciNO {

    public static void main(String[] args) {
        // take int input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(F(num));
    }

    static int F(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return F(num - 1) + F(num - 2);
    }
}