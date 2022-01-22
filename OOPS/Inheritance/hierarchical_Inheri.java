public class hierarchical_Inheri {
      static class A {
            public static void func() {
                  System.out.println("this is the cls A");
            }
      }

      static class B extends A {

      }

      static class C extends A {

      }

      public static void main(String[] args) {
            B test1 = new B();
            test1.func();
            C test2 = new C();
            test2.func();
      }
}
