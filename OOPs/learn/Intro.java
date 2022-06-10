package oops.learn;

/**
 * Intro
 */
public class Intro {

    public static void main(String[] args) {
        // obj of Student
        Student s = new Student(19, 10, "Abhay Prajapati");
        System.out.println(s.age + " " + s.name + " " + s.grade);
        Student s1 = new Student(18, 90, "Arin Prajapati");
        System.out.println(s1.age + " " + s1.name + " " + s1.grade);
    }
}

// this is a class

class Student {
    String name;
    int age;
    double grade;

    Student(int age, int grade, String name) {
        // this keyword is nothing but it is replacing the object name;
        // it can be anything while declaring the obj;
        // e.g. Student Abhay = new Student(19, 10, "Abhay Prajapati");
        // Abhay.name = "Abhay Prajapati";
        // Abhay.age = 19;
        // Abhay.grade = 10;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }
}
//
// why premative data don't need to use "new" keyword ?
// because premative data is already created in the memory
// they are not stored in the heap, they are stored in the stack
