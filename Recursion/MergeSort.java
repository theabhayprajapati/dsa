package Recursion;

import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        // randome array of integers
        int[] arr = { 5, 4, 3, 2, 1 };
        // print unsorted array
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
        // sort array
        mergeSort(arr, 0, arr.length - 1);
        // print sorted array
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = ((start + end) / 2);
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    // merge two 
    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }
        // this is for thie case of the array is not sorted;
        while (i <= mid) {
            temp[k++] = arr[i++];
        }   
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];
        }
    }
}