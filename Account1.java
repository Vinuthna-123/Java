import java.util.Scanner;
public class Account1 {
    int balance; 
    
    
    public void checkbal(int balance1){
        System.out.println("The Current balance is:"+balance1);
        this.balance=balance1;
    }

    
    void credit(int amount){
        if(amount>2000000){
        System.out.println("You cant be abel to credit more than 2 lakhs");
        }
        else if(amount<0){
        System.out.println("Cant debit an negative values \n Please enter an postive values to credit an amount");
        }
        else{
        System.out.println("The amount that you entered is:"+amount);
        int total = balance + amount;
        System.out.println("your Total amount after credit is: "+total);
    
        }
    }
    void debit(int amount1){
        if(amount1>balance){
        System.out.println("You dont have an sufficient balance to debit");
        }
        else if(amount1<0){
        System.out.println("Cant debit an negative values \n Please enter an postive values to debit an amount");
        }
        else{
        System.out.println("You are going to debit an amount");
        int tot = balance - amount1;
        System.out.println("Your total amount after debit:"+tot);
        }

    }
public static void main(String args[]){
     Account Ac=new Account();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the current Balance");
    int balance1 = in.nextInt();
    System.out.println("enter an amount that you need to credit:");
    int amount=in.nextInt();
    System.out.println("Enter the amount that you need to debit:");
    int amount1 = in.nextInt();
    Ac.checkbal(balance1);
    Ac.credit(amount);
    Ac.debit(amount1);
    // Ac.checkbal(balance1);
    in.close();

}
}
