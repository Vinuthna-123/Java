 import java.util.*;
 class Train {
    String name;
    String departureTime;
     String sourceStation;
     String destinationStation;
     int passengerStrength;
     int trainNumber;
     Train(String n , String deptime, String SouSta,String DesSta,int passStr,int tranum){
        this.name=n;
        this.departureTime=deptime;
        this.sourceStation=SouSta;
        this.destinationStation=DesSta;
        this.passengerStrength=passStr;
        this.trainNumber=tranum;

     }
     public String getname(String name){
        return name;
     }
     public String getdeotime(String departureTime){
        return departureTime;
     }
     public String getSousta(String sourceStation){
        return sourceStation;
     }
     public String getDesSta(String destinationStation){
        return destinationStation;
     }
     public int getStren(int passengerStrength){
        return passengerStrength;
     }
     public int gettrainnum(int trainNumber){
        return trainNumber;
     }
    public void DisplayTrains(String s , String d){
       System.out.println("Available Trains are: 1. Pinakini Express \n 2.  ");
     }   
}
public class RailwaySystem{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      // RailwaySystem rs = new RailwaySystem();
      Train t = new Train("Express", "9:00", "Chennai", "Nellore", 1, 12711);
      System.out.println("1:To display the trains \n 2.To Check the seat avilability \n 3.Book a Ticket \n 4.Cancel a Ticket \n 5.Display the ticket Details . \n 6.Exit");
      int n = in.nextInt();
      switch ((n)) {
         case 1:
           System.out.println("Enter an Source Station");
           in.nextLine();
           String s = in.nextLine();
           System.out.println("Enter an Destination Station");
           String d = in.nextLine();
           t.DisplayTrains(s,d); 
            break;
      
         default:
            break;
      }
    }
}
