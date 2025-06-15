class Animal {
    void makeSound(){
        System.out.println("******WELCOME TO ZOO******");
    }
    
}
class Lion extends Animal{
    @Override
    void makeSound(){
        System.out.println("The Lion sound is Roar Roar...... ");
    }
}
// class Rani extends Animal{
//     @Override
//     void makeSound(){
//         System.out.println("is too dangerous animal....the sound is vuuuuuuuuuu vuuuuuuuuuu");
//     }
// }
class Snake extends Animal{
    @Override
    void makeSound(){
        System.out.println("The Snake sound is pssssss pssssss......");
    }
    public static void main(String args[]){
        Animal a = new Animal();
        a.makeSound();
        Lion l = new Lion();
        l.makeSound();
        Snake s = new Snake();
        s.makeSound();
        // Rani r = new Rani();
        // r.makeSound();
        
    }
}
