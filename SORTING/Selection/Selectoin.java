package SORTING.Selection;

import java.util.Arrays;

public class Selectoin {
    public static void main(String[] args) {
        int[] nums = { 5,4,3,2,1};
        SelectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    // //todo: using selection sort Algo,
    static void SelectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // * starting from 0, and moving till the last index.
            int last = nums.length - i - 1;
            // * found the index, of last element.
            // 1st: 5 -1 -i;
            int maxIndex = getMax(nums, last);
            // * we found the greatest element with the getMax by providing till where we
            // want to find'
            // * we don't have to move till the end for find the greatest element.
            swap(nums, maxIndex, last);
            // * we we found the greatest element swap it with last element, so we pass kk

        }
    }

    static int getMax(int[] nums, int last) {
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int maxIndex, int last) {
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }
    // find the max element and then swap it with last element.
}