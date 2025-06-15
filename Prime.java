import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the valu of N:");
        int n = in.nextInt();
        System.out.println("The prime numbers in between 1 to " + n + " are : ");
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        in.close();

    }
}
