Java
========

Introduction
----------------
 >   This is a **Java** document 

Compile java program
--------------------
 >   **javac Main.class**

Run java program and pass arguments
----------------------------------
 >   **java Main arg1 arg2 **

## Code Example

```
    java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, Markdown!");
        }
    }
```

# Inheritance
## Single Inheritance
>One class inherits from another.
## Multilevel Inheritance
>A class inherits from a child class, forming a chain.
## Hierarchical Inheritance
>Multiple classes inherit from a single parent class.
## Using super in Inheritance
>super keyword is used to call the parent class methods or constructors.
## Method Overriding in Inheritance
>Child class overrides a method from the parent class.
## final Keyword with Inheritance
>final prevents further inheritance or method overriding.
## Interface Inheritance (Multiple Inheritance in Java)
>multiple inheritance is achieved through interfaces.

# Nested Classes
>>A static nested class in Java is a nested class that is declared with the static modifier. Unlike inner classes, static nested classes do not require an instance of the enclosing class to be instantiated. They behave like top-level classes but are logically grouped inside the enclosing class.

>>An inner class in Java is a non-static nested class that is associated with an instance of its enclosing class. It can access both the static and non-static members of the enclosing class.

>>A local class in Java is a class that is defined within a block of code, such as a method, a constructor, or a static initializer block. These classes are local to the block in which they are defined and cannot be accessed from outside the block.

## Access modifiers determine the visibility of classes, methods, variables, and constructors. There are four main access modifiers:

>**Public:** Accessible from anywhere in the program. \
>**Protected:** Accessible within the same package and by subclasses(even in other packages). \
>**Default (no keyword):** Accessible only within the same package.\
>**Private:** Accessible only within the same class.

## Comparison: Abstract Class vs Interface in Java
| **Feature**                  | **Abstract Class**                              | **Interface**                              |
|------------------------------|------------------------------------------------|-------------------------------------------|
| **Keyword**                  | `abstract`                                     | `interface`                               |
| **Methods**                  | Can have both abstract and concrete methods.   | Only abstract methods (before Java 8); can have default and static methods (from Java 8). |
| **Fields**                   | Can have instance variables.                   | Can only have `public static final` constants. |
| **Constructors**             | Can have constructors.                         | Cannot have constructors.                 |
| **Inheritance**              | Supports single inheritance.                   | Supports multiple inheritance.            |
| **Access Modifiers**         | Methods can have any access modifier.          | Methods are `public` by default.          |
| **When to Use**              | When you need partial abstraction or shared behavior. | When you need to define a strict contract. |

>>>An anonymous class in Java is a class without a name that is defined and instantiated in a single statement. It is often used to create an instance of a class or an interface with customized behavior without explicitly creating a separate subclass.

## Factory Method
>The Factory Method design pattern provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. It is often used when the exact type of the object to be created isn't known until runtime.

## Functional Interface 
>A functional interface in Java is an interface with exactly one abstract method. Functional interfaces are the basis of lambda expressions and method references introduced in Java 8.

# Lambda Expressions in Java

A **lambda expression** in Java is a concise way to express an instance of a **functional interface**. It allows you to pass behavior as parameters or implement methods in a more readable way. Lambda expressions were introduced in **Java 8** and are widely used in **functional programming**.

## Basic Syntax of Lambda Expression

```
(parameters) -> expression
```

# Exception Handling in Java

In Java, **exception handling** is a powerful mechanism to handle runtime errors, allowing the normal flow of execution to be preserved. By using exception handling, Java programs can respond to errors, display meaningful error messages, or perform specific actions to recover from the error.

## Types of Exceptions

There are two main categories of exceptions in Java:

### 1. **Checked Exceptions**

- **Definition**: Checked exceptions are exceptions that are checked at compile-time. The compiler ensures that the programmer handles or declares these exceptions.
- **Example**: `IOException`, `SQLException`, `FileNotFoundException`.

- **How to Handle**: You must handle checked exceptions using `try-catch` blocks, or declare them using the `throws` keyword in the method signature.

    ```java
    public void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);  // Might throw IOException
        BufferedReader reader = new BufferedReader(file);
        reader.readLine();
        reader.close();
    }
    ```

### 2. **Unchecked Exceptions (Runtime Exceptions)**

- **Definition**: Unchecked exceptions are exceptions that are not checked at compile-time. These exceptions are subclasses of `RuntimeException`. They typically indicate programming bugs, such as invalid array accesses or null pointer references.
- **Example**: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`.

- **How to Handle**: Unchecked exceptions do not require explicit handling or declaration. They can be caught optionally using `try-catch`.

    ```java
    public void divideNumbers(int a, int b) {
        int result = a / b;  // Might throw ArithmeticException if b is zero
    }
    ```

---

## Exception Hierarchy

The `Throwable` class is the superclass of all errors and exceptions in Java. It has two main subclasses:

- **Error**: Represents severe errors that are generally not recoverable (e.g., `OutOfMemoryError`, `StackOverflowError`).
- **Exception**: The superclass of all exceptions that can be handled by the program. It has two main categories:
    - **Checked Exceptions**: Subclasses of `Exception`, such as `IOException` or `SQLException`.
    - **Unchecked Exceptions (RuntimeException)**: Subclasses of `RuntimeException`, such as `NullPointerException`, `ArithmeticException`.

---

## Exception Handling Keywords

### 1. **try** and **catch**

- **try**: Contains the code that may throw an exception.
- **catch**: Catches the exception thrown by the `try` block and handles it.

    ```
    try {
        // Code that might throw an exception
    } catch (ExceptionType e) {
        // Exception handling code
    }
    ```

### 2. **finally**

- The `finally` block contains code that will always be executed, regardless of whether an exception was thrown or not. It's typically used for clean-up operations (e.g., closing file streams or database connections).

    ```
    try {
        // Code that might throw an exception
    } catch (ExceptionType e) {
        // Exception handling code
    } finally {
        // Always executes
    }
    ```

### 3. **throw** and **throws**

- **throw**: Used to explicitly throw an exception.

    ```
    throw new Exception("An error occurred!");
    ```

- **throws**: Used in a method signature to declare that a method can throw certain exceptions. The calling code must handle these exceptions.

    ```
    public void someMethod() throws IOException {
        // Code that can throw an IOException
    }
    ```

---

## Creating Custom Exceptions

You can create your own exception by extending the `Exception` class (for checked exceptions) or `RuntimeException` (for unchecked exceptions).

### Example of a Custom Checked Exception:

```
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

