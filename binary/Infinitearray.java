package Binary;

public class Infinitearray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 9 };
        searchRange(nums, 5);
    }

    static int searchRange(int[] nums, int target) {
        int start = 0;
        int end = 1;
        int ans = -1;
        while (target > nums[end]) {
            start = end;
            end = end * 2;
            System.out.println(end);
        }
        System.out.println("exited()");
   
        ans = binarySearch(nums,target, start, end);
        return ans;
    }

        static int binarySearch(int[] nums, int target, int start, int end) {
            int middle = Math.round((start + end) / 2);
            System.out.println("exited()");

            while (target != nums[middle] & start <= end) {
                if (target < nums[middle]) {
                    end = middle + 1;
                } else {
                    start = middle - 1;
                }
                middle = Math.round((start + end) / 2);
            }
            System.out.println(middle);
            return middle;
        }
}