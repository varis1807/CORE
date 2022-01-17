import java.util.*;

public class GetterSetters {
      private int salary;

      // A setter methide used to set the value
      void setSalary(int s) {
            if (s < 0)
                  s = -s;

            this.salary = s;
      }

      // A getter methide recieve the salary
      int getSalary() {
            return this.salary;
      }

      public void storeSalaryDB(int salary) {
            //
            System.out.println("The ");
      }


}
