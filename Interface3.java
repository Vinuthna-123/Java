interface shape{
    int calArea(int radius);
    int calArea1(int length,int breadth);

}
abstract class AbstractShape{
    void intializer(){
        int radius=0;
    }
   abstract void displayDetails();
}
class Circle extends AbstractShape implements shape{
    int radius;
    Circle(int radius){
       this.radius=radius;
       calArea(radius);
       displayDetails();
    }
    public int calArea(int radius){
        return (int)(3.14)*radius*radius;
    }
    @SuppressWarnings("null")
    public int calArea1(int length,int breadth){
        return (Integer) null;
    }
    void displayDetails(){
        System.out.println("Shape is Circle");
        System.out.println("Area of the Circle is:"+calArea(radius));
    }
}
class Rectangle extends AbstractShape implements shape{
    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        calArea1(length,breadth);
        displayDetails();
    }
    @SuppressWarnings("null")
    public int calArea(int radius){
        return (Integer) null;
    }
    public int calArea1(int length,int breadth){
        return length*breadth;
    }
    void displayDetails(){
        System.out.println("The shape is Rectangle");
        System.out.println("The area of the Rectangle is:"+calArea1(length, breadth));
    }
}




public class Interface3 {
    public static void main(String args[]){
        Circle c = new Circle(5);
        c.intializer();
        Rectangle r = new Rectangle(10, 20);
    }
    
}
