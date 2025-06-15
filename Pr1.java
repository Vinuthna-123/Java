import java.util.*;
public class Pr1 {
    int marks;
    String name;
    void getDetails(String name[],int marks[],int n){
         for(int i=0;i<n;i++){
            if(marks[i]>=90){
                System.out.println(name[i]+" Grade is A");
            }
            else if(marks[i]>=80){
                System.out.println(name[i]+" Grade is: B"); 
            }
            else if(marks[i]>=70){
                System.out.println(name[i]+" Grade is: C"); 
            }
                else if(marks[i]>=60){
                    System.out.println(name[i]+" Grade is: D"); 
                }
                else{
                    System.out.println(name[i]+" Grade is : E");
                }
            }

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no . of students:");
        int n =in.nextInt();
        System.out.println("Enter the marks of"+ n +"students :");
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
             marks[i]= in.nextInt();
        }
        System.out.println("enter the names of the Student:");
        String name[] = new String[n];
      in.nextLine();
        for(int i=0;i<n;i++){
            name[i]=in.nextLine();
        }
    Pr1 p = new Pr1();
    p.getDetails( name, marks, n);
            in.close();
        }

    }

