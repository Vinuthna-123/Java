// public class Aggregation { // in this class we are refering the state and behavior of another class.
//           int id;
//           String name;
//           Address adr;
//           void details(int id,String name){
//             this.id=id;
//             this.name=name;
//             System.out.println("ID is:"+id + "\n Name is :"+name);

//           }
//           public static void main(String args[]){
//             Aggregation ag = new Aggregation();
//             ag.details(22,"chinnu");
//             Address ad = new Address(); // craeting an object for Aggregation class which is address.To acces the values which are present inside an Address class.(aggregation class)
//             ad.getattri("Ponugodu", 32405, 12);
//           }   
// }
// class Address{
//     String street;
//     int pin_code;
//     int house_no;
//     void getattri(String st,int pc,int hn){
//         this.street=st;
//         this.pin_code=pc;
//         this.house_no=hn;
//         System.out.println("Street is:"+st + "\n Pin code is:"+pc+"\n house no is:"+hn);

//     }
// }




// using constructor
public class Aggregation{
    int id;
    final String name="Chinnu";
    Address adr; 
    // Aggregation(){

    // }
    Aggregation(int id,Address adr){
        this.id=id;
        // this.name=name;
        this.adr=adr;
        System.out.println("ID is:"+id + "\n Name is :"+name);

    }
    public static void main(String args[]){
        Address ad = new Address("Ponu",32405,54);
        Aggregation a = new Aggregation(21,ad);
        System.out.println(a.adr.pin_code);
        
    }
}
class Address{
    String street;
     int pin_code;
    int house_no;
    Address(String st,int pc,int hn){
        this.street=st;
       this.pin_code=pc;
       this.house_no=hn;
 System.out.println("Street is:"+st + "\n Pin code is:"+pc+"\n house no is:"+hn);

    }

}