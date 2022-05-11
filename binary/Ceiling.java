package binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 6, 7, 8, 12, 14, 15 };
        System.out.println(SearchCeiling(nums, 2323));
    }
    static int SearchCeiling(int[] nums, int target) {
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
        return target == nums[middle] ? middle : start;
    }
}