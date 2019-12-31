import java.util.*;
public class Employee{
String fName;
String lName;
double monSal;

public Employee(){
   fName = " ";
   lName = " ";
   monSal = 0.0;
}
public Employee(String fn, String ln, double sal){
   fName = fn;
   lName = ln;
   monSal = sal;

}
public void setfName(String fn){
   fName = fn;
}
public void setlName(String ln){
   lName = ln;
}
public void setSal(double sal){
   if (sal>0 || sal ==0){
   monSal = sal;
   }
}
public String getfName(){
   return fName;
}
public String getlName(){
   return lName;
}
public double getSal(){
   return monSal;
}

public double ySal(){
   return 12.0*monSal;
}
public double newSal(){
   return 1.1*12*monSal;
}
public void displayInfo(){
   System.out.println("Employee First name: " + fName);
   System.out.println("Employee Last name: " + lName);
   System.out.println("Employee Monthly Salary: " + monSal);

}
}