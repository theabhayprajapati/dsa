package Recursion;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1 };
        // print
        System.out.println("Before sorting: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    static void quickSort(int nums[], int low, int high) {
        if (low >= high)
            return;
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (start <= end) {
            while (nums[start] < pivot)
                start++;
            while (nums[end] > pivot)
                end--;
            if (start <= end) {

                swap(nums, start, end);
                start++;
                end--;
            }
        }
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
