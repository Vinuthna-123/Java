// 2D array print
import java.util.Scanner;
public class dime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row=sc.nextInt();
        System.out.println("enter number of columns:");
        int columns=sc.nextInt();
        System.out.println("Enter an 2D matrix elements:");
        int arr[][]=new int[row][columns];
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix elements are:");
            for(int i=0;i<row;i++){
                for(int j=0;j<columns;j++){
                    System.out.print(arr[i][j]+ " ");
                }
            System.out.println();
        }
        sc.close();
    }
    
    
    
}
