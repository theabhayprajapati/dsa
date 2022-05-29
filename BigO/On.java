package BigO;

import java.util.Scanner;

/**
 * On
 */
public class On {

    public static void main(String[] args) {
        // take int input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        // loop through num
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
        input.close();
        System.out.println("this is Big O of n: O(n)");
    }
}