abstract class Shape {
    abstract void draw();
    // abstract void tri();
    
}
class Rectangle extends Shape{
    protected void draw(){
        System.out.println("Drawing Rectangle");
    }   
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle:");

    }
}
public class Shape1{
    public static void main(String args[]){
        Shape s = new Circle();
        s.draw();
        s=new Rectangle();
        s.draw();
        s=new Triangle();
        s.draw();
        
    }
}
