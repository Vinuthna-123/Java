//we can also use constructor to reduce my code.try it using constructor.
import java.util.*;
abstract class Salary{
abstract int getSalary(int no_workingdays,int salary);
abstract void getCompany(String name);//static cant be used because if we use static then we cant create an class for static
void getProfile(String name,String depart,int no_workingdays){
    System.out.println("Name :"+name);
        System.out.println("Department:"+depart);
        System.out.println("No_of_Working days :"+no_workingdays);
        System.out.println("Salary is:"+getSalary(20, 1000));
}
}
class DepartmentStaff extends Salary{
    int getSalary(int no_workingdays,int salary) {
       return no_workingdays*4000;
    }
    void getCompany(String name){
        System.out.println("The company name is:"+name);
    }
}
class NonTechStaff extends Salary{
    int getSalary(int no_workingdays,int salary) {
        return no_workingdays*2000;
     }
    void getCompany(String name){
        System.out.println("The company name is:"+name);
    }
}
class Office extends Salary{
    int getSalary(int no_workingdays,int salary) {
        return no_workingdays*5000;
     }
    void getCompany(String name){
        System.out.println("The company name is:"+name);
    }
}
class StoreManager extends Salary{
    int getSalary(int no_workingdays,int salary) {
        return no_workingdays*1000;
     }
    void getCompany(String name){
        System.out.println("The company name is:"+name);
    }
}


public class Abstra1 {
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the role:");
      String s =in.nextLine();
      switch (s) {
        case "DepartmentStaff":
           DepartmentStaff s1 = new DepartmentStaff();
           s1.getProfile("Chikku", "DepartmentStaff", 25);
           s1.getCompany("SRM");
            break;
        case "NonTeachStaff":
            NonTechStaff s2 = new NonTechStaff();
            s2.getProfile("Chonty", "NonTeachStaff", 31 );
            s2.getCompany("KCG");
             break;
        case "Office":
             Office s3 = new Office();
             s3.getProfile("chaithu", "Office", 20 );
             s3.getCompany("Accenture");
              break;
        case "StoreManager":
              StoreManager s4 = new StoreManager();
              s4.getProfile("Chandhu", "StoreManager", 30 );
              s4.getCompany("Cognizant");
               break;
      
        default:
             System.out.println("Please enter an correct role.");
            break;
      }
        in.close();
    }
    
}
