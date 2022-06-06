package arrays;

import java.util.ArrayList;

/**
 * ArrayListlec
 */
public class ArrayListlec {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 to 20 add to list
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        int x = 7;
        int y = x;
        x = 2;
        System.out.println(x + ", " + y);
        // int[] ans = new int[list.size()];
        for (int i = 0; i < 3; i++) {

        }
        System.out.println(list);
        int a = 5;
        int b = 7;
        swap(a, b);
        System.out.println(a + ", " + b);   
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}