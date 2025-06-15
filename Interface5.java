class Product{
 String name;
 int price;
 float rating;
 Product(String name,float rating ,int price){
    this.name=name;
    this.price=price;
    this.rating=rating;
 }
 public String getName(){
    return name;
 }
 public int getPrice(){
    return price;
 }
 public float getRating(){
    return rating;
 }

}
class HairDryer extends Product{
    HairDryer(String name,float rating , int price){
        super(name, rating, price);
    }
}
class MakeupKit extends Product{
    MakeupKit(String name,float rating , int price){
        super(name, rating, price);
}
}
class Speakers extends Product{
    Speakers(String name,float rating , int price){
        super(name, rating, price);
    }
} 
class Headset extends Product{
    Headset(String name,float rating , int price){
        super(name, rating, price);
    }
}
public class Interface5 {
    public static void main(String args[]){
        System.out.println("--------------Product 1 ---------------");
        Headset h = new Headset("Headset", 3.8f, 500);
        System.out.println("Name of product is :"+h.getName()+"\n Rating of the product is:"+h.getRating()+"\n Price of the product is:"+h.getPrice());
        System.out.println("--------------Product 2 ---------------");
        Speakers s = new Speakers("Speakers", 4.1f, 1500);
        System.out.println("Name of product is :"+s.getName()+"\n Rating of the product is:"+s.getRating()+"\n Price of the product is:"+s.getPrice());
        System.out.println("--------------Product 3 ---------------");
        MakeupKit m = new MakeupKit("MakeupKit", 4.9f, 2000);
        System.out.println("Name of product is :"+m.getName()+"\n Rating of the product is:"+m.getRating()+"\n Price of the product is:"+m.getPrice());
        System.out.println("--------------Product 4 ---------------");
        HairDryer ha = new HairDryer("Hair Dryer", 4.5f, 2500);
        System.out.println("Name of product is :"+ha.getName()+"\n Rating of the product is:"+ha.getRating()+"\n Price of the product is:"+ha.getPrice());
    }
}
