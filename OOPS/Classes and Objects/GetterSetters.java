import java.util.*;

public class GetterSetters {
      private int salary;

      // A setter metho de used to set the value
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
            // code for storing the salary in db
            System.out.println("The ");
      }

      public static void main(String[] args) {
            // creating an obj of the getterSeterEx
            GetterSetters obj = new GetterSetters();

            obj.setSalary(-500000);
            int salary = obj.getSalary();

            // Storing salary in the db
            obj.storeSalaryDB(salary);
      }

}
