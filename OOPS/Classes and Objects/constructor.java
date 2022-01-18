import java.util.*;

public class constructor {
      // Default
      // Constructor================================================================
      // public static class Bike1 {
      // // creating a default constructor
      // Bike1() {
      // System.out.println("Bike is created");
      // }
      // }

      // // main method
      // public static void main(String args[]) {
      // // calling a default constructor
      // Bike1 b = new Bike1();
      // }

      // Parameterised constructor===================================================
      // public static class Student4 {
      // int id;
      // String name;

      // // creating a parameterized constructor
      // Student4(int i, String n) {
      // id = i;
      // name = n;
      // }

      // // method to display the values
      // void display() {
      // System.out.println(id + " " + name);
      // }
      // }

      // public static void main(String args[]) {
      // // creating objects and passing values
      // Student4 s1 = new Student4(111, "Karan");
      // Student4 s2 = new Student4(222, "Aryan");
      // // calling method to display the values of object
      // s1.display();
      // s2.display();
      // }
      // Copy
      // Constructor===============================================================

      public static class Student6 {
            int id;
            String name;

            // constructor to initialize integer and string
            Student6(int i, String n) {
                  id = i;
                  name = n;
            }

            // constructor to initialize another object
            Student6(Student6 s) {
                  id = s.id;
                  name = s.name;
            }

            void display() {
                  System.out.println(id + " " + name);
            }
      }

      public static void main(String args[]) {
            Student6 s1 = new Student6(111, "Karan");
            Student6 s2 = new Student6(s1);
            s1.display();
            s2.display();
      }
}
