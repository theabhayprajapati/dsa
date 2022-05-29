package Recursion;

/**
 * LectOne
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("somestring"));
        
    }

    // reveesion string recustion
    static String reverseString(String s) {
        if (s.equals("")) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

}
