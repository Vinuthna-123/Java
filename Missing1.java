import java.util.*;
public class Missing1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=in.nextInt();
         int arr[]=new int[size];
        System.out.println("Enter an array elements:");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        int sum=(size+1)*(size+2)/2;
        for(int i=0;i<size;i++){
             sum=sum-arr[i];
        }
        System.out.println("Missing number is:"+sum); 
        in.close();
        
    }
    
}
// /*Java Program to find the missing element*/
// import java.util.*;  
// import java.util.Arrays; 

// //Driver Code
// public class Missing1  
// {  
//    public static void main(String args[])   
//    {  
//        Scanner sc=new Scanner(System.in);

//       int n;    //Declare array size
//       System.out.println("Enter the total number of elements ");
//       n=sc.nextInt();     //Initialize array size

//       int arr[]=new int[n];   //Declare array
//       System.out.println("Enter the elements of the array ");
//       for(int i=0; i<n ;i++)     //Initialize array
//       {
//           arr[i]=sc.nextInt();
//       }
      
//       int sum=(n+1)*(n+2)/2;   //Calculate the expected sum of all the elements from 1 to n
//       for(int i=0;i<n;i++)
//       {
//           sum=sum-arr[i]; //Subtract each element from the sum
//       }
//       System.out.println("Missing Element is "+sum);  //Print the missing element
//    }
// }

