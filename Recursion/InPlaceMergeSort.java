package Recursion;

/**
 * InPlaceMergeSort
 */
public class InPlaceMergeSort {

    public static void main(String[] args) {
        int nums[] = { 5, 4, 3, 2, 1 };
        mergeSort(nums, 0, nums.length - 1);
    }

    static void mergeSort(int nums[], int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
        }
    }

    static void mergeThem(int nums[], int start, int mid, int end) {

        int i = start;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            nums[start + l] = temp[l];
        }

    }

}
