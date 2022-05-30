package Recursion;

import java.util.Scanner;

/**
 * BinarySearchRecursive
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // take innput for arr len
        int len = input.nextInt();
        // take innput for arr
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
        // take innput for search num
        int searchNum = input.nextInt();
        input.close();
        int ans = binarySearch(arr, searchNum, 0, arr.length - 1);
        System.out.println(ans);
    }

    // this
    private static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (target == arr[middle]) {
            return middle;
        } else if (target < arr[middle]) {
            return binarySearch(arr, target, start, middle - 1);
        } else {
            return binarySearch(arr, target, middle + 1, end);
        }
    }
}