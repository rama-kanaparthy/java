package anotherpackage;

import accessmodifiers.ParentAmClass;

public class TestAmChild extends ParentAmClass {
    public static void main(String[] args) {
        TestAmChild testAmChild = new TestAmChild();
        ParentAmClass parentAmClass = new TestAmChild();

        System.out.println(parentAmClass.publicField); // Accessible
      //  System.out.println(parentAmClass.protectedField); // Not accessible (different package, no subclass)

        // Access fields
        System.out.println(testAmChild.publicField); // Accessible
        System.out.println(testAmChild.protectedField); // Not accessible (different package, no subclass)
        // System.out.println(parent.defaultField);   // Not accessible (different package)
        // System.out.println(parent.privateField);   // Not accessible (private)

        // Access methods
        testAmChild.publicMethod();       // Accessible
        // parent.protectedMethod(); // Not accessible (different package, no subclass)
        // parent.defaultMethod();   // Not accessible (different package)
        // parent.privateMethod();   // Not accessible (private)
    }
}
