import java.util.Scanner;
public class Shapes {
    int radius;
    static float pi = 3.14f;
    int length;
    int breadth;
    int height;
    float calArea(int r){
        return (pi*r*r);
       
    }
    int calRectangle(int l,int br){
        int area = l*br;
        return area;
    }
    float calTriangle(int breadth,int height){
        return  (0.5f*breadth*height);
    }
    
    public static void main(String args[]){
        Shapes s = new Shapes();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Shape that you need to find an area\n 1.Circle \n 2.Rectangle \n 3.Triangle:");
        int n = in.nextInt();
        switch (n) {
            case 1:
            System.out.println("Enter radius for circle:");
            int r = in.nextInt();
            float area = s.calArea(r);
            System.out.println("Area of circle is :"+area);
            break;
            case 2:
            System.out.println("Enter length for an rectangle:");
            int l = in.nextInt();
            System.out.println("Enter breadth for an rectangle:");
            int br = in.nextInt();
            int ar = s.calRectangle(l, br);
            System.out.println("Area of rectangle is :"+ar);
            break;
            case 3:
            System.out.println("Enter height for an traingle:");
            int h = in.nextInt();
            System.out.println("Enter breadth for an triangle:");
            int b = in.nextInt();
            float res=s.calTriangle(h, b);
            System.out.println("Area of Traingle is :"+res);
            break;
            default:
            System.out.println("please enter an correct number to calculate the area of different shapes");
                break;
        }
        in.close();


        
    }
    
}
