package netedclasses;

public class NestedLocalClass {

    private String outerField = "Outer Field";

    public void outerMethod() {
        System.out.println("Inside outer method");

        // Local class defined inside a method
        class LocalClass {
            public void display() {
                System.out.println("Inside local class");
                System.out.println("Accessing outer class field: " + outerField);
            }
        }

        // Creating an instance of the local class
        LocalClass localInstance = new LocalClass();
        localInstance.display();
    }

    public static void main(String[] args) {
        NestedLocalClass outerInstance = new NestedLocalClass();
        outerInstance.outerMethod();
    }
}
