package accessmodifiers;

public class ParentAmClass {
    public String publicField = "Public Field";         // Accessible everywhere
    protected String protectedField = "Protected Field"; // Accessible in same package and subclasses
    String defaultField = "Default Field";              // Accessible in same package
    private String privateField = "Private Field";      // Accessible only within this class

    // Public method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Method to demonstrate access within the same class
    public void accessModifiersDemo() {
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
        System.out.println(privateField);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }

}

