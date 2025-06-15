import java.util.Scanner;
class Student {
    int m1,m2,m3,m4,name;
    float cgpa;
    void Cgpa(){
        cgpa=(m1+m2+m3+m4)/4;
        System.out.println("Cgpa is"+cgpa);
        
    }
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics marks:");
        s.m1=scan.nextInt();
        System.out.println("Enter your Maths marks:");
        s.m2=scan.nextInt();
        System.out.println("Enter your python marks:");
        s.m3=scan.nextInt();
        System.out.println("Enter your chemistry marks:");
        s.m4=scan.nextInt();
        s.Cgpa();
        scan.close();
        
       
    }
}