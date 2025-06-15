public class Account {
    static int balance= 2000;  
void credit(int amount){
    if(amount>2000000){
        System.out.println("You cant be abel to credit more than 2 lakhs");
    }
    else if(amount<0){
        System.out.println("Cant debit an negative values \n Please enter an postive values to credit an amount");
    }
    else{
     System.out.println("The amount that you need to enter is:"+amount);
     int total = balance + amount;
     System.out.println("your Total amount after credit is: "+total);
    
}
}
void debit(int amount){
    if(amount>balance){
        System.out.println("You dont have an sufficient balance to debit");
    }
    else if(amount<0){
        System.out.println("Cant debit an negative values \n Please enter an postive values to debit an amount");
    }
    else{
        System.out.println("You are going to debit an amount");
        int tot = balance - amount;
        System.out.println("Your total amount after debit:"+tot);
    }

}
public static void main(String args[]){
    Account Ac=new Account();
    Ac.credit(1000);
    Ac.debit(500);
}
public void checkbal(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'checkbal'");
}
}