import java.util.Scanner;
public class User {
    String name;
    int age;
    // void details(String n ,int age){
    //     System.out.println("Your Complete details are:");
    //     // System.out.println("Your name :"+n);
    //     // System.out.println("Your id:"+id);
    //     System.out.println("Your age:"+age);
    //     System.out.println("Your name :"+n);
    //     int salary = 50000;
    //     System.out.println("Your salary:"+salary);

    // }
    public static void main(String args[]){
        // User u = new User();
       Scanner in = new Scanner(System.in);
    //    System.out.println("Enter your name:");
    //    String n = in.nextLine();
       System.out.println("Enter your age:");
       int age = in.nextInt();
       System.out.println("Enter your name:");
       in.nextLine();//i am considering one dummy line to consider(store) that enter in it. 
       String n = in.nextLine();//here it will scan the string from the user.
       System.out.println(age);
       System.out.println(n);
    //    u.details(n, age);

       in.close();

    }
    
}
