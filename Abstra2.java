// //Abstraction using constructor.
// import java.util.Scanner;
// abstract class Bank{
//     String b_name;
//     int amount;
//     float Rate_of_interest;
//     abstract void getRoi(int am,float roi); //Rate_of_interest
//     void getDetails(String name,int am,float roi){
//         this.b_name=name;
//         this.amount=am;
//         this.Rate_of_interest=roi;
//         System.out.println("Bank name is:"+b_name);
//         System.out.println("Amount is:"+amount);
//         System.out.println("Object Reference is:"+this.toString());
// }
// }

// class RBI extends Bank{
//     RBI(String name,int am,float roi){
//         this.amount=am;
//         this.b_name=name;
//         this.Rate_of_interest=roi;
//         getRoi(am,roi);
//         getDetails(name, am,roi);

//     }
//     void getRoi(int am,float roi){
//         int res= (int) (am*roi)/100;
//         System.out.println("The rate of interest for RBI is:"+res);

//     }
    
// }
// class Hdfc extends Bank{
//     Hdfc(String name,int am,float roi){
//         this.b_name=name;
//         this.amount=am;
//         this.Rate_of_interest=roi;
//         getRoi(am,roi);
//         getDetails(name, am,roi);
//     }
//     void getRoi(int am,float roi){
//         int res1 = (int) (am*roi)/100;
//         System.out.println("The rate of interest for HDFC is:"+res1);
//     }

// }



// public class Abstra2 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String name = in.nextLine();
//         switch (name) {
//             case "RBI":
//              Bank b = new RBI("Reserve Bank of India",50000,0.5f);
//                 break;
//             case "Hdfc":
//              Bank c = new Hdfc("HDFC", 50000,0.8f);
//              break;
        
//             default:
//             System.out.println("please Enter an valid Bank name");
//                 break;
//         }
//         in.close();
//     }
    
// }
import java.util.Scanner;

abstract class Bank {
    String b_name;
    int amount;
    float Rate_of_interest;

    abstract void getRoi(int am, float roi); // Rate_of_interest

    void getDetails(String name, int am, float roi) {
        this.b_name = name;
        this.amount = am;
        this.Rate_of_interest = roi;
        System.out.println("Bank name is:" + b_name);
        System.out.println("Amount is:" + amount);
        System.out.println("Object Reference is:" +b_name);
    }
}

class RBI extends Bank {
    RBI(String name, int am, float roi) {
        this.amount = am;
        this.b_name = name;
        this.Rate_of_interest = roi;
        getRoi(am, roi);
        getDetails(name, am, roi);

    }

    void getRoi(int am, float roi) {
        int res = (int) (am * roi) / 100;
        System.out.println("The rate of interest for RBI is:" + res);

    }

}

class Hdfc extends Bank {
    Hdfc(String name, int am, float roi) {
        this.b_name = name;
        this.amount = am;
        this.Rate_of_interest = roi;
        getRoi(am, roi);
        getDetails(name, am, roi);
    }

    void getRoi(int am, float roi) {
        int res1 = (int) (am * roi) / 100;
        System.out.println("The rate of interest for HDFC is:" + res1);
    }

}

public class Abstra2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Bank b = null; // Declare the reference variable outside the switch statement
        switch (name) {
            case "RBI":
                b = new RBI("Reserve Bank of India", 50000, 0.5f);
                break;
            case "Hdfc":
                b = new Hdfc("HDFC", 50000, 0.8f);
                break;

            default:
                System.out.println("Please enter a valid Bank name");
                break;
        }
        in.close();
    }

}
