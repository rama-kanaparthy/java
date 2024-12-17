package inheritance;

class Child extends Parent {
    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child constructor called.");
    }

    void display() {
        super.display(); // Calls Parent's display method
        System.out.println("Child class method.");
    }
}
