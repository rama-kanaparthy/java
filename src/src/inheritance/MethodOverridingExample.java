package inheritance;

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Calls Dog's sound() method
    }
}
