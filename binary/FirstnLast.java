package Binary;

import java.util.Arrays;

public class FirstnLast {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 5 };
        int target = 4;
        System.out.println(Arrays.toString(StartEnding(nums, target)));
    }

    static int[] StartEnding(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                int ans1 = binarySearch(nums, target, true);
                ans[0] = ans1;
                int ans2 = binarySearch(nums, target, false);
                ans[1] = ans2;
                return ans;
            }
        }
        return ans;
    }

    static int binarySearch(int[] nums, int target, boolean startorend) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = Math.round((start + end) / 2);
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (startorend) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}