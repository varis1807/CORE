public class readOnly {
      // private data member
      private static String clg = "AGPCE";

      // getter methode for clg
      public static String getCollege() {
            return clg;
      }

      public static void main(String[] args) {
            System.out.println(getCollege());
      }
}
