package SORTING.Bubble;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void BubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // System.out.println("i" + i);
            for (int j = 1; j < nums.length - i; j++) {
                // System.out.println("j" + j);
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

    }
}