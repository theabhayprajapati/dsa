package SORTING.Bubble;

import java.util.Arrays;

public class PracticeBubble {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 0, -1, -2323, 323423 };
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void BubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
// Language: java
// Path: SORTING\Bubble\PracticeBubble.java
// Compare this snippet from SORTING\Insertion\Insertion.java:
// package SORTING.Insertion;

