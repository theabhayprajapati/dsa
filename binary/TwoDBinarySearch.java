package Binary;
public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        MatixBinarySearch(matrix, 37);
    }

    static int[] MatixBinarySearch(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            System.out.println("value : " + matrix[r][c] + " row: " + r+ " col : " + c);
            if (matrix[r][c] == target) {
                System.out.println("value : " + matrix[r][c] + " row: " + r + " col : " + c);
                return new int[] { r, c };
            } else if (matrix[r][c] < target) {
                System.out.println("value : " + matrix[r][c] + " row: " + r + " col : " + c);
                r++;
            } else {
                System.out.println("value : " + matrix[r][c] + " row: " + r + " col : " + c);
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}