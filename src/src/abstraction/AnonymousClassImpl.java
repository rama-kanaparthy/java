package abstraction;
abstract class ShapeAbstractClass {
    abstract void draw();
}

public class AnonymousClassImpl {
    public static void main(String[] args) {
        // Using an anonymous class to extend a concrete class
        ShapeAbstractClass shapeAbstractClass = new ShapeAbstractClass() {
            @Override
            void draw() {
                System.out.println("Drawing a circle");
            }
        };

        shapeAbstractClass.draw(); // Output: Drawing a circle
    }
}

