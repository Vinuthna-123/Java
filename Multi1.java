
import java.util.*;
public class Multi1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows for m1:");
        int r1=in.nextInt();
        System.out.println("Enter no of columns for m1:");
        int c1=in.nextInt();
        System.out.println("Enter no of rows for m2:");
        int r2=in.nextInt();
        System.out.println("Enter no of columns for m2:");
        int c2=in.nextInt();
        int res[][]=new int[r1][c2];
        int m1[][]=new int[r1][c1];
        System.out.println("Enter an elements for matrix 1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j]=in.nextInt();
                // System.out.println(m1[i][j]+" ");

            }
        }
        int m2[][]=new int[r2][c2];
        System.out.println("Enter an elements for matrix 2:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=in.nextInt();
                // System.out.print(m2[i][j]+" ");

            }
        }
        if(c1!=r2){
            System.out.println("Cant multiply the matrix.please check and try again");
        }
        else{
            System.out.println("The multiplication matrix is:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                         res[i][j]+=m1[i][k]*m2[k][j];

                    }
                    System.out.print(res[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        in.close();
    }
    
}
