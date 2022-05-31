package SORTING.cyclic;

import java.util.Arrays;

/**
 * CyclicSort
 */
public class CyclicSort {

    public static void main(String[] args) {
        // unsort arraycd
        int[] nums = { 2, 0, 1, 3 };
        cyclicSortFN(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cyclicSortFN(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
            // this
        }
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}