package SORTING.Bubble;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 0, -1, -2323, 323423, };
        SortingAlgo(nums);
    }

    static void SortingAlgo(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
    }
}