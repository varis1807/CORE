import java.util.*;

public class extendsKeyword {
      static class employee {
            float salary = 40000;
      }

      static class programme extends employee {
            int bonus = 10000;
      }

      public static void main(String[] args) {
            programme p = new programme();
            System.out.println("pro. salary is: " + p.salary);
            System.out.println("bonus : " + p.bonus);
      }
}
