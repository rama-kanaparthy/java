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

