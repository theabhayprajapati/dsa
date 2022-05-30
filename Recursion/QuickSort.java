package Recursion;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        int pi = arr.length - 1;
        // puut all the values smaller than the pivot to the left of the pivot
        // and all the values bigger than the pivot to the right of the pivot

        quickSort(arr, 0, pi);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int i, int pi) {
        if (i < pi) {
            int pivot = partition(arr, i, pi);
            quickSort(arr, i, pivot - 1);
            quickSort(arr, pivot + 1, pi);
        }
    }

    private static int partition(int[] arr, int i, int pi) {
        int pivot = arr[pi];
        int j = i;
        for (int k = i; k < pi; k++) {
            if (arr[k] <= pivot) {
                swap(arr, j, k);
                j++;
            }
        }
        swap(arr, j, pi);
        return j;
    }

    private static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;

    }
}
// this is recursive function;
// we select an element;
//