package anotherpackage;


import accessmodifiers.ParentAmClass;

public class TestAccessModifiers {
    public static void main(String[] args) {
        ParentAmClass parent = new ParentAmClass();

        // Access fields
        System.out.println(parent.publicField); // Accessible
        // System.out.println(parent.protectedField); // Not accessible (different package, no subclass)
        // System.out.println(parent.defaultField);   // Not accessible (different package)
        // System.out.println(parent.privateField);   // Not accessible (private)

        // Access methods
        parent.publicMethod();       // Accessible
        // parent.protectedMethod(); // Not accessible (different package, no subclass)
        // parent.defaultMethod();   // Not accessible (different package)
        // parent.privateMethod();   // Not accessible (private)
    }
}
