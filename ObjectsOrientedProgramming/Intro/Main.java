/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student Abhay = new Student(); // declaration
        System.out.println(Abhay);
        // Abhay.id =1;
        Abhay.name = "Abhay";
        // print
        System.out.println(Abhay.id);
        System.out.println(Abhay.name);
    }
    // this is a data type.

}

class Student {
    int id = 12;
    String name;
    // constructor defines what happend when we define the objects.
    
}