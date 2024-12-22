package accessmodifiers;


public class ChildAmClass extends ParentAmClass {
    public void showAccess() {
        // Access fields
        System.out.println(publicField);     // Accessible
        System.out.println(protectedField); // Accessible (same package and subclass)
        System.out.println(defaultField);   // Accessible (same package)
        // System.out.println(privateField); // Not accessible (private)

        // Access methods
        publicMethod();       // Accessible
        protectedMethod();    // Accessible
        defaultMethod();      // Accessible
        // privateMethod();   // Not accessible (private)
    }
}

