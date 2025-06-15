public class Constructor {
    int id;
    String name;
    int total,m1,m2,m3,m4;
    int total1;
    Constructor(){ //default constructor
        System.out.println("This is an default constructor");
    }
    Constructor(int id , String name,int m1,int m2,int m3,int m4){
        this.id=id;
        this.name=name;
        int total1 = calTotal(m1,m2,m3,m4);  
        System.out.println(name); 
        System.out.println(id);
        System.out.println("total1 is:"+total1);
    }
    int calTotal(int m1,int m2,int m3,int m4){
        int total=m1+m2+m3+m4;
        return total;
    }
    public static void main(String args[]){
        Constructor obj = new Constructor();
        Constructor obj1= new Constructor(22 , "Vinu" ,90,80,99,70);
        // obj1.calTotal(90, 80, 90, 99);
    }
    
}
