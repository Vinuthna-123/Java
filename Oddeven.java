import java.util.Scanner;
public class Oddeven {
    public static void main(String args[]){
        // Oddeven a = new Oddeven();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                System.out.print("even\t");
            }
            else{
                System.out.print("odd\t");
            }
        }
        in.close();
        
    }
}
