package Binary;

import java.util.Arrays;

public class SortedTwoD {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 8;
        System.out.println(Arrays.toString(MatixBinarySearch(matrix, target)));
        int[] ans = new int[2];
        ans = MatixBinarySearch(matrix, target);
        int[] ansMat = new int[2];
        ansMat = BinarySearch(matrix, ans[0], ans[1], target);
        System.out.println(ansMat);
        
    }
    static int[] MatixBinarySearch(int[][] matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cStart = 0;

        while (rStart < rEnd) {
            while (rStart < rEnd) {
                int rMid = Math.round((rStart + rEnd) / 2);
                if (matrix[rMid][cStart] == target) {
                    System.out.println(rStart + " " + rEnd);
                    return new int[] { rMid, rEnd };
                } else if (target > matrix[rMid][cStart]) {
                    rStart = rMid + 1;
                } else {
                    rEnd = rMid - 1;
                }
            }
        }
        System.out.println(rStart + " " + rEnd);

        return new int[] { rStart, rEnd };
    }

    static int[] BinarySearch(int[][] matrix, int rStart, int rEnd, int target) {
       
        System.out.println(rStart + " " + rEnd);
        for (int i = rStart; i < rEnd + 1; i++) {
            System.out.println(i);
        }
        return new int[] { -1, -1 };
    }
}