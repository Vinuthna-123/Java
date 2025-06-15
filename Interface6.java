interface Playable{
    void play();
    void stop();
}
class MP3Player implements Playable{
      public void play(){
        System.out.println("--------MP3Player--------");
        System.out.println("Heyyy enjoy with listening the songs through an MP3Player");
      }
      public void stop(){
        System.out.println("Once you feel boring you can stop Listening.");
        System.out.println("-------------------------");
      }
}
class Radio implements Playable{
    public void play(){
        System.out.println("---------Radio--------");
        System.out.println("The song will give you an pleasent feeling , when you listen the songs through Radio.");
      }
      public void stop(){
        System.out.println("If you didnt get pleasent feeling, you can stop Listening on Radio.");
        System.out.println("--------------------------");
      }
}




public class Interface6 {
    public static void main(String args[]){
    Radio r = new Radio();
    r.play();
    r.stop();
    MP3Player m = new MP3Player();
    m.play();
    m.stop();
    
}
}
