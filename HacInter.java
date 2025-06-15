import java.util.*;
interface AdvancedAirthmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedAirthmetic{
     public int divisor_sum(int n){
        int sum=0;
        System.out.println("I implemented: AdvancedAirthmetic");
        while(n!=0){
            int i=0;
            if(n%i==0){
                 sum = sum+i;
            }
        }
       return sum;
    }
}
public class HacInter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
     AdvancedAirthmetic aa=new MyCalculator();
     int res=aa.divisor_sum(n);
     System.out.println(res);
     in.close();
    }
}
