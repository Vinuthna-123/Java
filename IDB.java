//hierarichal inheritance.
class RBI {
    int simple_interest;
    int principal_amount;
   private double rate_of_interest;
    int time;
    RBI(double rate_of_interest){
        this.rate_of_interest=rate_of_interest;
    }
      double calinterest(int principal_amount,int time){
          double res = (principal_amount * rate_of_interest * time)/100 ;
          return res;
      } 
}
class SBI extends RBI{
    SBI(double rate_of_interest){
        super(rate_of_interest);
    }
}
class HDFC extends RBI{
    HDFC(double rate_of_interest){
        super(rate_of_interest);
    }
}
class IDB extends RBI{
    IDB(double rate_of_interest){
        super(rate_of_interest);
    }
    
    public static void main(String args[]){
        
        IDB idb = new IDB(0.5);
        HDFC hdfc = new HDFC(0.25);
        SBI sbi = new SBI(1.0);
        double res1=sbi.calinterest(1000,3);
        System.out.println("The simple interest in SBI is:"+res1);
        double res2=hdfc.calinterest(1000,3);
        System.out.println("The simple interest in HDFC is:"+res2);
        double res3=idb.calinterest(1000,3);
        System.out.println("The simple interest in IDB is:"+res3);   
}
}
