package abstraction;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    // Define a Functional Interface
    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);
    }

    public static void main(String[] args) {
        // Implement the functional interface using a lambda expression
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");

        // Call the method
        greeting.sayHello("Alice"); // Output: Hello, Alice!
        greeting.sayHello("Bob");   // Output: Hello, Bob!

        // Another Example: Using Runnable (Built-in Functional Interface)
        Runnable task = () -> System.out.println("Running a task in a separate thread...");
        new Thread(task).start();  // Output: Running a task in a separate thread...

        // 1. Using Supplier - produces a value (no input)
        Supplier<String> greetingSupplier = () -> "Hello, Supplier!";
        System.out.println(greetingSupplier.get()); // Output: Hello, Supplier!

        // 2. Using Consumer - accepts a value and performs an action
        Consumer<String> greetConsumer = (name) -> System.out.println("Hello, " + name + "!");
        greetConsumer.accept("Alice");  // Output: Hello, Alice!
        greetConsumer.accept("Bob");    // Output: Hello, Bob!

        // 3. Using Predicate - evaluates a condition (returns boolean)
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(5)); // Output: false
    }
}

