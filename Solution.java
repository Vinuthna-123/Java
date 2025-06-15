//Leetcode1.
import java.util.Scanner;
class Solution {
     public int[] twoSum(int[] arr, int target,int n) {
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(arr[i]+arr[j]==target){
                   return new int[]{i,j};
               }
           }
       }
    return new int[]{-1,-1};
         
        
    }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
       }
       int target = in.nextInt();
     Solution s = new Solution();
     int[] res=s.twoSum(arr,target,n);
     if(res[0]!=-1 && res[1]!=-1){
        System.out.println(res[0]+" "+res[1]);
     }
     else{
        System.out.println("Solution is not resolved");
     }
     in.close();
    }
}
// leet code solution i which they have give an array and target number from that we need to check whether the any addition of two numbers is equals to my target in my whole array.
