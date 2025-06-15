
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
