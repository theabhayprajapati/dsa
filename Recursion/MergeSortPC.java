package Recursion;

import java.util.Arrays;

/**
 * MergeSortPC
 */
public class MergeSortPC {

    public static void main(String[] args) {
        // make merge sort funciton

        int nums[] = { 5, 4, 3, 2, 1 };
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(nums));
        mergeSort(nums);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] is) {
        // if array is empty or has one element, return
        if (is.length <= 1) {
            return;
        }
        // find middle of array
        int mid = is.length / 2;
        // make left and right arrays
        int[] left = new int[mid];
        int[] right = new int[is.length - mid];
        // copy left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = is[i];
        }
        for (int i = mid; i < is.length; i++) {
            right[i - mid] = is[i];
        }
        // sort left and right arrays
        mergeSort(left);
        mergeSort(right);
        // merge left and right arrays
        merge(left, right, is);
    }

    private static void merge(int[] left, int[] right, int[] is) {
        // make left and right pointers
        int leftPtr = 0;
        int rightPtr = 0;
        // make is pointer
        int isPtr = 0;
        // while left and right pointers are not at the end of their arrays
        while (leftPtr < left.length && rightPtr < right.length) {
            // if left is less than right
            if (left[leftPtr] < right[rightPtr]) {
                // add left to is
                is[isPtr] = left[leftPtr];
                // move left pointer
                leftPtr++;
            } else {
                // add right to is
                is[isPtr] = right[rightPtr];
                // move right pointer
                rightPtr++;
            }
            // move is pointer
            isPtr++;
        }
        // while left pointer is not at the end of its array
        while (leftPtr < left.length) {
            // add left to is
            is[isPtr] = left[leftPtr];
            // move left pointer
            leftPtr++;
            // move is pointer
            isPtr++;
        }
        // while right pointer is not at the end of its array
        while (rightPtr < right.length) {
            // add right to is
            is[isPtr] = right[rightPtr];
            // move right pointer
            rightPtr++;
            // move is pointer
            isPtr++;
        }

    }
}