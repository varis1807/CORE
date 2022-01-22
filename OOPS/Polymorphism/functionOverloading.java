public class functionOverloading {
      public static class Adder {
            public static int add(int a, int b) {
                  return a + b;
            }

            public static int add(int a, int b, int c) {
                  return a + b + c;
            }
      }

      // public static void main(String[] args) {
      // System.out.println(Adder.add(11, 11));
      // System.out.println(Adder.add(11, 11, 11));
      // }

      // Q) Why Method Overloading is not possible by changing the return type of
      // method only?
      // In java, method overloading is not possible by changing the return type of
      // the method only because of ambiguity. Let's see how ambiguity may occur:

      class Adder {
            static int add(int a, int b) {
                  return a + b;
            }

            static double add(int a, int b) {
                  return a + b;
            }
      }

      public static void main(String[] args) {
            System.out.println(Adder.add(11, 11));// ambiguity
      }
}
