//array basics how to use an array in java.
import java.util.*;
public class Missing {
    int size;
    int arr;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = in.nextInt();
        System.out.println("Enter the array elements:");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){ 
        arr[i]=in.nextInt();
        System.out.println(arr[i]);
        }
        in.close();
    }
    
}
// public class Missing{
//     int arr;
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//         int size=arr.length;
//         for(int i=0;i<size;i++){
//             System.out.println(arr[i]);
//         }

//     }
// }
// for each use chesi array loo undee values ella print cheyochu.
// public class Missing{
//     public static void main(String args[]){
//         int arr[]={1,4,7,8,45,89};
//         for(int var:arr){ //var anedhi array loo undde values nii one by one store chesukune dhaniki .
//             System.out.println(var);
//         }
//     }
// }
