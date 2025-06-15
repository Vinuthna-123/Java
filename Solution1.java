import java.util.*;

public class Solution1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int origin=n;
        String s="";
        if(n==0){ //Conversion of int to string . is it is converted print good job else wrong answer.
          s="0";
        }
        else{
            if(n<0){
                s="-";
                origin=-origin;
            }
        }
        while(n>0){
            int digit = n%10;
            char dichar = (char)('0'+digit);
            s=dichar+s;
            n=n/10;
            // System.out.println("Conversion: " + n + " -> " + s);
        }
        if(origin>=0 || Integer.toString(origin).equals(s)){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        in.close();
    }
}

