import java.util.Scanner;

public class N {
    int n;
    void print(int a){
        int sum =0;
        for(int i=1;i<=a;i++){
             sum = sum +i;
            System.out.println(i);

        }
        System.out.println("sum is:"+sum);
    }

    public static void main(String args[]){
        N n = new N();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        n.print(a);
        in.close();
    }
    
}
