class Animal {
     void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
     void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
     void meow() {
        System.out.println("Cat is meowing.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat(); // Accessing eat method of Animal class
        dog.eat();    // Accessing eat method inherited from Animal class
        cat.eat();    // Accessing eat method inherited from Animal class

        //  dog.bark();  // Accessing bark method of Dog class
         //cat.meow();  // Accessing meow method of Cat class

        // You can't access bark and meow methods directly from the animal reference
    }
}

