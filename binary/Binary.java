package binary;

public class Binary {
    public static void main(String[] args) {
        int[]    nums = { 1, 2, 4, 5, 6, 7, 8, 12, 14, 15 };
        System.out.println(binarySearch(nums, 12));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = Math.round((start + end) / 2);
        while (start < end) {
            if (target < nums[middle]) {
                end = middle - 1;

            } else {
                start = middle + 1;
            }
            middle = Math.round((start + end) / 2);
        }
        return target == nums[middle] ? middle : -1;
    }
}