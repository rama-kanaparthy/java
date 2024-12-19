package netedclasses;

public class StaticNestedOuterClass {

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Inside static nested class");
        }
    }

    public void outerMethod() {
        System.out.println("Inside outer class method");
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        StaticNestedOuterClass.StaticNestedClass nestedInstance = new StaticNestedOuterClass.StaticNestedClass();
        nestedInstance.display();

        // Calling a method in the outer class
        StaticNestedOuterClass outerInstance = new StaticNestedOuterClass();
        outerInstance.outerMethod();
    }
}
