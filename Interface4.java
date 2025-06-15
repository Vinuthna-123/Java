interface Transcation{
    void deposit(int amount);
    void withdraw(int amount);
}
abstract class Bankaccount{
    private long account_number;
     int balance;
    int amount;
    Bankaccount(long account_number,int inbalance){
        this.account_number=account_number;
        this.balance=inbalance;
    }
    public long getAccount(){
        return account_number;
    }
    public  int getBalance(){
        return balance;
    }
}
class SavingAccount extends Bankaccount implements Transcation{
    SavingAccount(long account_number,int inbalance){
        super(account_number,inbalance);
    }
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("please enter an valid amount to deposit.");
        }
        else{
             balance += amount;
            System.out.println("The amount is Deposited in SavingAccount Successfully.");
        }
    }
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("please enter an valid amount to withdraw.");
        }
        else{
            balance -= amount;
            System.out.println("your amount is withdraw from SavingAccount Successfull");
        }
}
    }
class CurrentAccount extends Bankaccount implements Transcation{
    CurrentAccount(long account_number,int inbalance){
        super(account_number,inbalance);
    }
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("please enter an valid amount to deposit.");
        }
        else{
            balance += amount;
            System.out.println("The amount is Deposited in CurrentAccount Successfully.");
        }
    }
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("please enter an valid amount to withdraw.");
        }
        else{
            balance -= amount;
            System.out.println("your amount is withdraw from CurrentAccount Successfull");
        }
}
}
public class Interface4 {
    public static void main(String args[]){
        SavingAccount s = new SavingAccount(7396651321l,5000);
        s.deposit(2000);
        s.withdraw(1000);
        CurrentAccount a = new CurrentAccount(1459662546l,1500);
        a.deposit(2500);
        a.withdraw(1500);
        System.out.println("the amount in SavingsAccount is:"+s.getBalance());
        System.out.println("the amount in CurrentAccount is:"+a.getBalance());
    }
    
}
