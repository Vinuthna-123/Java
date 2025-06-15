import java.util.Scanner;
public class Salary {
    int emp_id;
    String name;
    int n;
    int s;
    Salary(int id,String name,int n,int s){
        int Salary = n*s;
        System.out.println("Employee id is:"+id);
        System.out.println("Employee name :"+name);
        System.out.println("Salary of the employee is:"+Salary);
    }
    
    public static void main(String args[]){
        // Salary sal = new Salary();
        Scanner in = new Scanner(System.in);
        System.out.println("enter employee id:");
        int id=in.nextInt();
        System.out.println("enter employee name:");
        in.nextLine();
        String name=in.nextLine();
        System.out.println("enter number of working days:");
        int n=in.nextInt();
        System.out.println("enter Employee per day salary:");
        int s=in.nextInt();
        Salary sal = new Salary(id,name,n,s);
        in.close();
    }
}
