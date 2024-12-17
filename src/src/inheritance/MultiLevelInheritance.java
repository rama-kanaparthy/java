package inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Grandparent method
        myPuppy.bark(); // Parent method
        myPuppy.weep(); // Child method
    }
}
