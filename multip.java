public class multip {
    
    public static void main(String args[]){
        int arr1[][]={{1,2,3},{1,2,3},{1,2,3}};
        int arr2[][]={{1,2,3},{1,2,3},};
        int r1=arr1.length;
        int c1=arr1[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;
        int res[][]=new int[r1][c2];
        if(c1!=r2){
            System.out.println("Cant multiply the matrix please try again.");
        }
        else{
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
            for(int k=0;k<c1;k++){
             res[i][j]+= arr1[i][k]*arr2[k][j];
            }
            
            }
        }
    System.out.println("The multiplication Matrix is:");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            System.out.print(res[i][j]+" ");

        }
        System.out.println(" ");
    }
        }
}
}
        
    
