package oops.learn.packages.b;

/**
 * Greet
 */
public class Greet {
    public static void main(String[] args) {
        System.out.println("Hello World");
        greet();
    }

    // export this fn
    public static void greet() {
        System.out.println("hello World from oops.learn.packages.b.Greet");
    }

}
