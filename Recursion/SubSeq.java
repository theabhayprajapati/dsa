package Recursion;

/**
 * SubSeq
 */
public class SubSeq {

    public static void main(String[] args) {
      
        // System.out.println(subSeq(str, "abc"));
        subSeq("", "abc");
    }

    static void subSeq(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }
        // this is recursive call
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
}

//! DON'T CHANGE THE PRINCIPLE WHICH MAKING TREE,

// input automatically becomes small,
// recursion is the decision which are depended on choices.
