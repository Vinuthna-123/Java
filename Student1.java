public class Student1 {
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
        Student1 s1=new Student1();
        s1.name="Kiran";
        s1.id=12;
        s1.m1=80;
        s1.m2=70;
        s1.m3=90;
        s1.m4=68;
        s1.yearofstudy=3;
        s1.getInfo();
        s1.getTotal();
        s1.getAverage();


    }    
}
