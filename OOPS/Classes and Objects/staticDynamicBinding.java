import java.util.*;

public class staticDynamicBinding {
      // // Static Binding=======================================================
      // // class 1
      // public static class superclass {
      // static void print() {
      // System.out.println("print() int superclass is called");
      // }
      // }

      // // class 2
      // public static class subclass extends superclass {
      // // method of inner cls
      // static void print() {
      // System.out.println("print() in subcls is called");
      // }
      // }

      // public static void main(String[] args) {
      // superclass A = new superclass();
      // superclass B = new subclass();

      // A.print();
      // B.print();
      // }

      // Dynamic Binding===============================
      // cls 1
      public static class superCls {
            void print() {
                  System.out.println("print superCls");
            }
      }

      // cls 2

}
