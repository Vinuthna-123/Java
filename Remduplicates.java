import java.util.*;
public class Remduplicates {
    public static void main(String args[]){
        // int arr[]=new int[]{1,3,2,1,3,4,6,5,7,3,5,3,7,6,7,7};
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n=in.nextInt();
        System.out.println("Enter an array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=in.nextInt();
        }
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        for(int i=0;i<arr.length;i++){
            visited[arr[i]]=true;
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==true)
            System.out.print(" "+i);
        }
        in.close();
    }
   
}