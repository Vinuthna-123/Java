// import java.util.Scanner;
// public class larsmall {
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         int arr[]=new int[8];
//         System.out.println("enter the array elements:");
//         for(int i=0;i<8;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<8;i++){
//             for(int j=i+1;j<8;j++){
//                 if(arr[j]<arr[i]){ // arr[i]>arr[j]
//                 int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//             }
//             for(int i=0;i<8;i++){
//                 System.out.println(arr[i]);
//             }
//             in.close();
//         }

// for intialized array.
//         // int arr[]={1,2,3,4,5,6,7};
//         //  int a=arr.length;
//         // System.out.println(arr[a-2]);
      
//     }
    public class larsmall{
        public static void main(String[] args) {
            int arr[]={1,5,3,6,7,2,8};
            int temp=0;
            for(int row=0;row<arr.length;row++){
                for(int colum=row+1;colum<arr.length;colum++){
                    if(arr[row]>arr[colum]){
                        temp=arr[row];
                        arr[row]=arr[colum];
                        arr[colum]=temp;
                        
                    }
                }
            }
    int asc=0;
    int des=arr.length-1;
while(asc<des){
    System.out.print(arr[des--]+" ");
    System.out.print(arr[asc++]+" ");
}
        }
    }