package arrays;

import java.util.Arrays;

/**
 * RotateArray
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        rotateFN(nums, 3);
        System.out.println(Arrays.toString(rotateFN(nums, 3)));

    }

    static int[] rotateFN(int[] nums, int k) {
        // swap elemtns
        for (int i = 0; i < k; i++) {
            int temp = nums[0];
            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[nums.length - 1] = temp;
        }
        return nums;
    }

}