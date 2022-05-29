
package Binary;
import java.util.Arrays;

public class PracticeMatrixBinary {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(MatixBinarySearch(matrix, 30)));
    }

    static int[] MatixBinarySearch(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) {
                System.out.println(matrix[r][c]);
                return new int[] { r, c };
            } else if (target > matrix  [r][c]) {
                System.out.println(matrix[r][c]);
                r++;
            } else {
                System.out.println(matrix[r][c]);
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}