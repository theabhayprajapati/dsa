package Binary;

/**
 * RotatedBinarySearch
 */
public class RotatedBinarySearch {

    public static void main(String[] args) {

        int nums[] = { 1, 3 };
        // search 2;
        System.out.println(search(nums, 3));
    }

    public static int search(int nums[], int target) {
        int pivot = findPivot(nums);
        System.out.println("pivot: " + pivot);
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] <= target) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static int findPivot(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // mid and mid + 1 when mid is more that end
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
