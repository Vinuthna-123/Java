import java.util.Scanner;
 class Employee {//main function dhentloo rasthavoo akkada public ani petali calss kii. remaining classes ki avasaram ledhu.
    int id;
    String name;
    long phone_num;
    String address;
    int salary;
    int no_workingdays;
    Employee(int salary,int no_workingdays ){
        this.salary=salary;
        this.no_workingdays=no_workingdays;

     }
     int getSalary(int salary,int no_workingdays){
        int res = salary * no_workingdays;
       return res;
     }

    
}
 class Staff extends Employee{
    String role;
    int experience;
    String dept_name;
     Staff(int id,String name,String address,int salary,int no_workingdays,String role,String dept_name,int experience){
        super(salary, no_workingdays);//super class dwara employee loo emi emi kavali oo avi send cheyali.
        this.role=role;
        this.experience=experience;
        this.dept_name=dept_name;
        this.id=id;
        this.name=name;
        this.address=address;

     }
    void getDetails(){
        System.out.println("Employee ID is :"+id);
        System.out.println("Employee Name is :"+name);
        System.out.println("Employee address  :"+address);
       int res1= getSalary(salary, no_workingdays);
        System.out.println("Employee salary is :"+res1);
        System.out.println("Employee role :"+role);
        System.out.println("Employee experience :"+experience);
        System.out.println("Employee deptname is :"+dept_name);

    }
}
    public class Employee_Staff{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Id:");
        int id=in.nextInt();
        System.out.println("Enter your name:");
        in.nextLine();
        String name=in.nextLine();
        System.out.println("Enter your address:");
        String address=in.nextLine();
        System.out.println("Enter your no.of.working days:");
        int no_workingdays=in.nextInt();
        System.out.println("Enter your one day salary:");
        int salary=in.nextInt();
        System.out.println("Enter your role:");
        in.nextLine();
        String role=in.nextLine();
        System.out.println("Enter your working Department name:");
        String dept_name=in.nextLine();
        System.out.println("Enter your experience:");
        int experience=in.nextInt();
        
        Staff st=new Staff(id,name,address,no_workingdays,salary,role,dept_name,experience);
        st.getDetails();
        in.close();
        

        
    }
}

