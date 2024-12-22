package abstraction;

public class FactoryMethodExample {

    // Step 1: Define a Common Interface
    interface Shape {
        void draw();
    }

    // Step 2: Implement Concrete Classes
    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Step 3: Create a Factory Class
    static class ShapeFactory {
        // Factory Method
        public Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            }
            return null;
        }
    }

    // Step 4: Client Code
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle and call its draw method
        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null) {
            circle.draw(); // Output: Drawing a Circle
        }

        // Get a Rectangle and call its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            rectangle.draw(); // Output: Drawing a Rectangle
        }

        // Try an unknown shape
        Shape unknown = shapeFactory.getShape("TRIANGLE");
        if (unknown == null) {
            System.out.println("Unknown shape type!"); // Output: Unknown shape type!
        }
    }
}
