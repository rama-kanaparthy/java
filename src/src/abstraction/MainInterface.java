package abstraction;

interface AnimalInterface {
    // Abstract method
    void makeSound();

    // Default method (Java 8+)
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

class DogIn implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class MainInterface {
    public static void main(String[] args) {
        AnimalInterface dog = new DogIn();
        dog.makeSound(); // Output: Bark
        dog.sleep();     // Output: Sleeping...
    }
}

