public class multiLevel_Inheri {
      static class A {
            public static void func1() {
                  System.out.println("this is the cls A");
            }
      }

      static class B extends A {
            public static void func2() {
                  System.out.print("this is cls B");
            }
      }

      static class C extends B {

      }

      public static void main(String[] args) {
            C test = new C();
            test.func1();
            test.func2();
      }
}
