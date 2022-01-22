public class multiPle_inheri {
      static class A {
            public static void func1() {
                  System.out.println("this is cls A");
            }
      }

      static class B {
            public static void func2() {
                  System.out.println("this is cls B");
            }
      }

      static class C extends B {

      }

      static class C extends A {

      }

      public static void main(String[] args) {
            C test = new C();
            test.func1();
      }
}
