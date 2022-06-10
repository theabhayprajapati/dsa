import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int nums[][] = {
                { 5, 10, 20 },
                { 6, 12, 24 },
                { 8, 16, 30 }
        };
        int key = 30;
        int ans[] = binarySearch(nums, key);
        System.out.println(Arrays.toString(ans));

    }

    static int[] binarySearch(int nums[][], int key) {
        int r, c;
        r = 0;
        c = nums.length - 1;
        while (r < nums.length && c >= 0) {
            if (nums[r][c] == key) {
                return new int[] { r, c };
            }
            if (nums[r][c] < key) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}