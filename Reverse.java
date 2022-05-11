import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        ReverseChar(s);
    }
    static void ReverseChar(char[] s) {
        char[] ans = new char[s.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = s[(s.length - 1) - i];
        }
        System.out.println(Arrays.toString(ans));
    }
}