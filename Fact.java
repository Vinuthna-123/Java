import java.util.Scanner;
public class Fact {
    int n;
    void fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
             fact *= i;
            //  n=n-1;
            //  System.out.println("The Factorial of an number is : " +fact);
        }
        System.out.println("The Factorial of an number is : " +fact);
        
    }
    public static void main(String args[]){
        Fact fa = new Fact();
        Scanner in = new Scanner(System.in);
        System.out.println("enter an number");
        int n = in.nextInt();
        fa.fact(n);
        in.close();
        }
    }
    

