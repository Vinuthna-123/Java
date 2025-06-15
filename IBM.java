class car{
     static int distance=50;
     static int fuel_consumed=10;
     void getMileage(int distance,int fuel_consumed){//static method aithee dhanni kinda call cheyalem.so static thesesanu.
        int mileage=distance*fuel_consumed;
        System.out.println("mileage of the normal car is:"+mileage);   
    }
    void method(){
        System.out.println("This is the car with normal features.");
    }
}
class Tata extends car{
    Tata(){
        System.out.println("Tata car have an Airbag feature. ");
    }
}
class nano extends Tata{
    nano(){
        System.out.println("An nono car have an health monitoring");
    }
    void sensor(){
            System.out.println("Nano will have an sensors. ");
        }
    }
class BMW extends nano{
    BMW(){
        super();
        System.out.println("This is an IBM which has an Biometric access.");
    }
     void getMileage1(int distance,int fuel_consumed){
        int mileage=distance*fuel_consumed;
        System.out.println("mileage of the ibm is:"+mileage);

         
    }
    public static void main(String args[]){
        BMW bmw=new BMW();
        bmw.getMileage1(20,10);
        bmw.sensor();
        bmw.getMileage(distance,fuel_consumed);
    }

}

