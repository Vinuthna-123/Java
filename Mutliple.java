// multiple inheritance in java using interface.
interface Android{
    void OSver();
    void Seacontacts();
}
interface Iphone{
    void Security();
    void Camclarity();
    
}
class oneplus implements Android{
    oneplus(){
      OSver();
      Seacontacts();
    }
   public void OSver(){
    System.out.println("----ONEPLUS----");
    System.out.println("The OS version of the Android is 11");
   }
   public void Seacontacts(){
    System.out.println("Android have an Search Contacts Feature.");
   }
}
class Samsung implements Android{
    Samsung(){
        OSver();
        Seacontacts();
    }
    public void OSver(){
        System.out.println("--------SAMSUNG--------");
        System.out.println("The OS version of the samsumg is 12");
       }
       public void Seacontacts(){
        System.out.println("Samsung have an Search Contacts Feature.");
       }
}
class S12 implements Iphone{
    S12(){
        Security();
        Camclarity();
    }
    public void Security(){
        System.out.println("--------S12--------");
        System.out.println("The S12 iphone is very Secure.");
    }
    public void Camclarity(){
        System.out.println("The S12 iphone will have an verh high camera clarity.");
    }
}
class M13 implements Iphone{
    M13(){
        Security();
        Camclarity();
    }
    public void Security(){
        System.out.println("--------M13--------");
        System.out.println("The M13 iphone is very Secure.");
    }
    public void Camclarity(){
        System.out.println("The camera clarity of an M13 iphone is very good.");
    }
}
class product implements Android,Iphone{
    product(){
      OSver();
      Seacontacts();
      Security();
      Camclarity();
    }
    public void OSver(){
        System.out.println("---------PRODUCT--------");
        System.out.println("The OS version of the product is 13 ");
    }
    public void Seacontacts(){
        System.out.println("The product will also have an Search Contacts Feature.");
       }
       public void Security(){
        System.out.println("This product is very highly Secure.");
    }
    public void Camclarity(){
        System.out.println("This product will have an verh high camera clarity.");
    }


}

public class Mutliple {
    public static void main(String args[]){
        Android a = new oneplus();
        Android b = new Samsung();
        Iphone i1 = new S12();
        Iphone i2 = new M13();
        product p = new product();

    }
    
}
