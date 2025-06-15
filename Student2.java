import java.util.Scanner;
public class Student2 {
    String name;
    int id;
    int m1,m2,m3,m4;
    float totmarks;
    int yearofstudy;
    float cgpa;
    void getInfo(){
        System.out.println("Name: " +name);
        System.out.println("ID is:"+id);
        System.out.println("Marks in maths:"+m1);
        System.out.println("Marks in physics:"+m2);
        System.out.println("Marks in python:"+m3);
        System.out.println("Marks in java:"+m4);
        System.out.println("YearofStudy is:"+yearofstudy);
    }
    void getTotal(){
        totmarks=(m1+m2+m3+m4);
        System.out.println("Total Marks are:"+totmarks);
    }
    void getAverage(){
        cgpa=(m1+m2+m3+m4)/4;
        System.out.println("Cgpa is :"+cgpa);
    }
    public static void main(String args[]){
        Student2 s2[]=new Student2[3];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<s2.length;i++){
        s2[i]=new Student2();
        System.out.println("Enter Your Name:");
        s2[i].name=scan.nextLine();
        System.out.println("Enter Your ID:");
        s2[i].id=scan.nextInt();
        System.out.println("Enter Your english marks:");
        s2[i].m1=scan.nextInt();
        System.out.println("Enter Your Maths marks:");
        s2[i].m2=scan.nextInt();
        System.out.println("Enter Your Java marks:");
        s2[i].m3=scan.nextInt();
        System.out.println("Enter Your physics marks:");
        s2[i].m4=scan.nextInt();
        System.out.println("Enter Your Year of study:");
        s2[i].yearofstudy=scan.nextInt();
        s2[i].getTotal();
        s2[i].getAverage();
        s2[i].getInfo();
        scan.close();



        }
    }
}