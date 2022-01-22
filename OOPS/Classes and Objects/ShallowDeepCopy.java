import java.util.*;

public class ShallowDeepCopy {
      // FileName: StringCopyExample1.java==--------------------------------------

      // main method
      // public static void main(String argvs[]) {
      // // an object of the String class is created
      // String obj1 = new String("JavaTpoint is a very good site.");

      // // copying obj1 to obj2
      // String obj2 = obj1;
      // // we have updated the string for reference variable obj2
      // obj2 = "JavaTpoint is very good.";

      // // printing the hash code using the reference variable obj1.
      // System.out.println("The hash code is: " + obj1.hashCode());
      // // printing the string
      // System.out.println("The string is: " + obj1 + "\n");

      // // printing the hash code using the reference variable obj2.
      // System.out.println("The hash code is: " + obj2.hashCode());
      // // printing the string
      // System.out.println("The string is: " + obj2);
      // }

      /// FileName:
      /// DataTypeCopyExample.java---------------------------------------------

      // main method
      public static void main(String argvs[]) {
            int x = 9;
            int y = x;

            System.out.println("The value of x & y are: " + x + ", " + y);

            // updating the value of y
            y = 10;

            System.out.println("The value of x & y are: " + x + ", " + y);

            boolean b1 = false;

            // copying the value of b1 in b2
            boolean b2 = b1;

            System.out.println("The value of b1 & b2 are: " + b1 + ", " + b2);

            // updating the value of b2
            b2 = true;
            System.out.println("The value of b1 & b2 are: " + b1 + ", " + b2);

      }

}
