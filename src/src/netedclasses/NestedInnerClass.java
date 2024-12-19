package netedclasses;

public class NestedInnerClass {

    private String outerField = "Outer Class Field";

    // Inner class
    public class InnerClass {
        public void display() {
            System.out.println("Inside inner class");
            System.out.println("Accessing outer class field: " + outerField);
        }
    }

    public void outerMethod() {
        System.out.println("Inside outer class method");
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        NestedInnerClass outerInstance = new NestedInnerClass();

        // Create an instance of the inner class using the outer class instance
        NestedInnerClass.InnerClass innerInstance = outerInstance.new InnerClass();

        // Call a method in the inner class
        innerInstance.display();

        // Call a method in the outer class
        outerInstance.outerMethod();
    }
}
