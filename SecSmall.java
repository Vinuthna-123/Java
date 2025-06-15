import java.util.Arrays;
import java.util.Scanner;
public class SecSmall{
    public static void secondsmalles(int[] arr,int n){
        Arrays.sort(arr);
        System.out.println("the second smallest element is:"+arr[1]);
        // System.out.println("The second largest element is:"+arr[n-2]); // this will only work without duplicate numbers in array.
        int fmax = arr[n-1];
        int smax = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<fmax){
                smax=arr[i];
                break;
            }
        }
        if(smax==-1){
            System.out.println("there is no second max");
        }else{
            System.out.println("the second max element is:"+smax);
        }

        // int fmin = Integer.MAX_VALUE;
        // int smin = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     if(arr[i]<fmin){
        //         smin = fmin;
        //         fmin=arr[i];
        //     }
        //     else if(arr[i]<smin && arr[i]!=fmin){
        //         smin = arr[i];
        //     }
        // }
        // if(smin == Integer.MAX_VALUE){
        //     System.out.println("there is no second min element");
        // }else{
        //     System.out.println("The second element is:"+smin);
        // }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        secondsmalles(arr,n);
        in.close();

    }

}
