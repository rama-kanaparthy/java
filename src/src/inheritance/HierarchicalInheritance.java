package inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();
        myDog.bark();

        myCat.eat();
        myCat.meow();
    }
}
