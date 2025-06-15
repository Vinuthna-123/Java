import java.util.Scanner;
public class Factorial {
    int number;
    int fact( int n){
        if((n==0)||(n==1)){
            return n;
        }
        else{
            return n*fact(n-1);
        }

    }

    public static void main(String args[]){
        Factorial fa=new Factorial();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for finding an factorial");
        int n=in.nextInt();
        int res = fa.fact(n);
        System.out.println("The factorial of number is :"+res);
        in.close();


    }

    
}
