package SORTING.MergeSort;

import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Before sorting: " + Arrays.toString(arr));
        System.out.println("After sorting: " + Arrays.toString(mergeSort(arr)));

    }

    // merge sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    static int[] merge(int[] mergeSort, int[] mergeSort2) {
        int[] result = new int[mergeSort.length + mergeSort2.length];
        int i = 0, j = 0, k = 0;
        while (i < mergeSort.length && j < mergeSort2.length) {
            if (mergeSort[i] < mergeSort2[j]) {
                result[k] = mergeSort[i];
                i++;
            } else {
                result[k] = mergeSort2[j];
                j++;
            }
            k++;
        }
        while (i < mergeSort.length) {
            result[k] = mergeSort[i];
            i++;
            k++;
        }
        while (j < mergeSort2.length) {
            result[k] = mergeSort2[j];
            j++;
            k++;
        }
        return result;
    }
}