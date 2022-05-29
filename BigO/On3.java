package BigO;

/**
 * On3
 */
public class On3 {

    public static void main(String[] args) {
        // make 3d array
        // print 3d array
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array[i][j][k] = i + j + k;
                }
            }
        }
        // print it
        for (int i = l0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}