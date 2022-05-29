package SORTING.quickSort;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // quick sort
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    // partition
    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// with qs we select an element;
// and then take all the smaller elemtn and put them before the selected
// element;
// and then take all the bigger elements and put them after the selected
// element;
// and then we do the same with the left and right part of the array;
// RECURSION.