class Ani {
    void method(){
        System.out.println("this is the animal method.");
    }
    
}
class dog extends Ani{
    void method(){
        System.out.println("this is the dog method");
    }
}
class cat extends Ani{
    void method(){
        System.out.println("This is the cat method");
    }
}
    public class Animal{
    public static void main(String args[]){
        Ani a = new Ani();
          dog an = new dog();
          cat c = new cat();
          a.method();
          an.method();
          c.method();
    }
}