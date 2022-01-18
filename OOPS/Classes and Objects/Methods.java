import java.util.*;

public class Methods {

      // preDifine Method
      // public static void main(String[] args) {
      // // using the max() method of Math class
      // System.out.print("The maximum number is: " + Math.max(9, 7));
      // }

      // User-difined Method
      // user defined method
      public static void findEvenOdd(int num) {
            // method body
            if (num % 2 == 0)
                  System.out.println(num + " is even");
            else
                  System.out.println(num + " is odd");
      }

      public static void main(String args[]) {
            // creating Scanner class object
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number: ");
            // reading value from user
            int num = scan.nextInt();
            // method calling
            findEvenOdd(num);
      }
}
