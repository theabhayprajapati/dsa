
package Binary;

public class FindMountain {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 9, 7, 8, 6 };
        findPeak(nums, 7);

    }

    static void findPeak(int[] nums, int target) {
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
        System.out.println("pass");
        binarySearch(nums, target, start);

    }

    static int binarySearch(int[] nums, int target, int end) {
        int start = 0;
        System.out.println("end: " + end);
        int middle = Math.round((start + end) / 2);
        while (target != nums[middle] & start <= end) {
            if (target < nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = Math.round((start + end) / 2);
        }
        return middle;
    }
}