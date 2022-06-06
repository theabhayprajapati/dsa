package Binary;

public class Peak {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 9, 10, 12, 13, 14, 14, 8, 6, 3, 4 };
        System.out.println(nums[findPeak(nums)] + " " + findPeak(nums));
    }

    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = Math.round((start + end) / 2);
            if (nums[middle] > nums[middle + 1]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}