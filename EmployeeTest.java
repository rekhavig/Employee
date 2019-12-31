import java.util.*;
public class EmployeeTest{
   public static void main(String[] args){
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      e1.setfName("Rekha");
      e1.setlName("Vig");
      e1.setSal(10000.50);
      e2.setfName("Nina");
      e2.setlName("Gupta");
      e2.setSal(20000.50);
      e1.displayInfo();
      System.out.println("Raised Salary is: " + e1.newSal());
      e2.displayInfo();
      System.out.println("Raised Salary is: " + e2.newSal());    
   }
}