package abstraction;
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class MainAbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Bark
        dog.sleep();     // Output: Sleeping...
    }
}
