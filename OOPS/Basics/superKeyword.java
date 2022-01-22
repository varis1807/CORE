public class superKeyword {
      // 1) super is used to refer immediate parent class instance variable.------

      class Animal {
            String color = "white";
      }

      class Dog extends Animal {
            String color = "black";

            void printColor() {
                  System.out.println(color);// prints color of Dog class
                  System.out.println(super.color);// prints color of Animal class
            }
      }

      // public static void main(String args[]){
      // Dog d=new Dog();
      // d.printColor();
      // }

      // 2) super can be used to invoke parent class method--------------

      public static class Animal1 {
            public static void eat() {
                  System.out.println("eating...");
            }
      }

      public static class Dog1 extends Animal1 {
            public static void eat() {
                  System.out.println("eating bread...");
            }

            public static void bark() {
                  System.out.println("barking...");
            }

            public static void work() {
                  super.eat();
                  bark();
            }
      }

      public static void main(String args[]) {
            Dog d = new Dog();
            d.work();
      }

      // 3) super is used to invoke parent class constructor.-----------------

      class Animal2 {
            Animal2() {
                  System.out.println("animal is created");
            }
      }

      class Dog2 extends Animal {
            Dog2() {
                  super();
                  System.out.println("dog is created");
            }
      }
      // public static void main(String args[]){
      // Dog d=new Dog();
      // }
}
