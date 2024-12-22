import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class LambdaExample {

    public static void main(String[] args) {

        // 1. Simple Lambda Expression (No Parameters)
        Runnable greet = () -> System.out.println("Hello, World!");
        greet.run();  // Output: Hello, World!

        // 2. Lambda Expression with Parameters (Add two numbers)
        MathOperation add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operation(5, 3));  // Output: Sum: 8

        // 3. Lambda Expression with Multiple Statements
        Greeting greetMultiple = (name) -> {
            String message = "Hello, " + name;
            return message;
        };
        System.out.println(greetMultiple.sayHello("Alice"));  // Output: Hello, Alice

        // 4. Lambda with Built-in Functional Interfaces

        // Predicate example (checks if a number is even)
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));  // Output: Is 4 even? true

        // Consumer example (prints the given string)
        Consumer<String> printMessage = (message) -> System.out.println("Message: " + message);
        printMessage.accept("Hello, Lambda!");  // Output: Message: Hello, Lambda!

        // Function example (converts a string to uppercase)
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("java"));  // Output: Uppercase: JAVA

        // Supplier example (provides a value)
        Supplier<String> greetingSupplier = () -> "Hello, Supplier!";
        System.out.println(greetingSupplier.get());  // Output: Hello, Supplier!
    }

    // Custom Functional Interface with a method to add two numbers
    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    // Custom Functional Interface with a method to say hello
    @FunctionalInterface
    interface Greeting {
        String sayHello(String name);
    }
}
