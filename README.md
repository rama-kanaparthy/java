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