package Recursion;

/**
 * RemoveChar
 */
public class RemoveChar {

    public static void main(String[] args) {
        String str = "abcdeafg";
        System.out.println(removeChar(str, 'a'));
    }

    static String removeChar(String str, char c) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == c) {
            return removeChar(str.substring(1), c);
        }
        return str.charAt(0) + removeChar(str.substring(1), c);
    }
}

// SUBSETS:
// taking some elements and removing some elements from the set: is subset pattern.
// n!/r!(n-r)!