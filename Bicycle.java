class Vehicle {
    int speed ;
    int fuel_capacity;
    //    Vehicle(int speed,int fuel_capacity){
    //     this.speed=speed;
    //     this.fuel_capacity=fuel_capacity;
        
    //   }
    void getattri(int speed,int fuel_capacity){
        this.speed=speed;
        this.fuel_capacity=fuel_capacity;

    }
    void getDetails(){ 
        System.out.println("The speed is:"+speed);
        System.out.println("The fuel capacity is:"+fuel_capacity);
    }
    }
class Car extends Vehicle{
    int no_gears;
    void getcar(int speed,int fuel_capacity,int no_gears){
        getattri(speed, fuel_capacity);
        this.no_gears=no_gears;
    }
         
}
class Bicycle extends Vehicle{
    int no_gears;
   void getbicycle(int speed,int no_gears){
       getattri(speed, no_gears);
    this.no_gears=no_gears;
   }
    public static void main(String args[]){
        Bicycle bc = new Bicycle();
        System.out.println("Bicycle Details");
        bc.getbicycle(10, 2);
        bc.getDetails();
        Car c = new Car();
        System.out.println("Car Details");
        c.getcar(100, 50, 3);
        c.getDetails();
        
    }

}
