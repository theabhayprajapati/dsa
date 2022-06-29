package oops.learn.packages.a;
// import the fn herer form oops.learn.packages.a.Greet
import oops.learn.packages.a.Greet;
/**
 * Feed
 */
public class Feed {

    public static void main(String[] args) {
        System.out.println("Feed");
        // Greet.greet();    
        Greet g = new Greet();
        g.greet();
    }
}