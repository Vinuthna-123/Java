public class Static {
    static int counter=1;
    void increment(){
        counter++;
        System.out.println(counter);
        }
    // void display(){
    //     System.out.println(counter);
    // }
    public static void main(String args[]){
        Static sta = new Static();
        sta.increment();
        sta.increment();
        // sta.display();
    }
    
}
