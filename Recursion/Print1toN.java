package Recursion;

/**
 * Print1toN
 */
public class Print1toN {

    public static void main(String[] args) {
        int n = 5;
        print1toN2(n);
    }

    static void print1toN(int n, int num) {
        if (n > num) {
            return;
        }
        System.out.println(n);
        print1toN(n + 1, num);
    }

    static void print1toN2(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println(n);
        print1toN2(n - 1);
    }
}
// this is recursive call.
// ! DON'T CHANGE THE PRINCIPLE WHICH MAKING TREE,