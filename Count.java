import java.util.*;
public class Count {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter an array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int visited[]=new int[n];
        for(int i=0;i<visited.length;i++){
            visited[i]=0;
        }
        // int count=0;
        for(int i=0;i<n;i++){
            visited[arr[i]]++;//straight gaa aa visited array ney increment chesthunnam.
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]>0)
            System.out.println("no of times "+ i + " occured is "+ visited[i]);
        }
        System.out.println("");
        in.close();
    }
    
}
