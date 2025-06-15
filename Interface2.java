interface engine{
    void engineStatus();
    void fuelManage();
    void tempManage();
}
interface Features{
    void airBags();
    void GPSnavi();
    void remoteAcess();
}
abstract class Vehicle{
    String type;
    int year;
    String color;
      Vehicle(String ty,int ye,String co){
        this.type=ty;
        this.year=ye;
        this.color=co;
        System.out.println("The type of the vehicle is:"+ty);
        System.out.println("Year of manufacturing of vehicle is:"+ye);
        System.out.println("The color of the vehicle is:"+co);

      }
}
class car extends Vehicle implements engine,Features{
    car(String type,int year,String color){
        super(type, year, color);

    }
    public void engineStatus(){
        System.out.println("The status of the engine is good. its start and end was super.");
    }
    public void fuelManage(){
        System.out.println("This engine will consume very less fuel.");
    }
    public void tempManage(){
        System.out.println("This vehicle engine will also manage an temperature. ");
    }
    public void airBags(){
        System.out.println("This car will have an airbags feature to say your life when met with accident. ");
    }
    public void GPSnavi(){
        System.out.println("This car will also have an GPS navigation");
    }
    public void remoteAcess(){
        System.out.println("you can acces this car remotely.");
    }

}
public class Interface2 {
    public static void main(String args[]){
        car c = new car("Bmw", 2021, "black");
        c.engineStatus();
        c.fuelManage();
        c.tempManage();
        c.airBags();
        c.GPSnavi();
        c.remoteAcess();

    }
    
}
