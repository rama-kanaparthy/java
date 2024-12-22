package abstraction;

public class AnonymousInterfaceImplementation {
    public static void main(String[] args) {
        // Using an anonymous class to implement an interface
        AnimalAnonymousInterface animal = new AnimalAnonymousInterface() {
            @Override
            public void makeSound() {
                System.out.println("Roar");
            }
        };

        animal.makeSound(); // Output: Roar
    }
}

interface AnimalAnonymousInterface {
    void makeSound();
}

