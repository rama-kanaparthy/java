package inheritance;

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}
