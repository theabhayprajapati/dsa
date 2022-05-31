package SORTING.Selection;

import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 5, 4, 3, 2, 1 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void selectionSort(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length - 1 - i;
            int maxIndex = getMax(nums, lastIndex);
            swap(nums, maxIndex, lastIndex);

        }

    }

    static void swap(int nums[], int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;

    }

    static int getMax(int nums[], int last) {
        int maxNum = 0;
        for (int i = 0; i <= last; i++) {
            if (nums[i] > nums[maxNum]) {
                maxNum = i;
            }
        }
        return maxNum;
    }
}
