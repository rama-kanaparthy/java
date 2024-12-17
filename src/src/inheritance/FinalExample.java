package inheritance;

final class FinalParent {
    void show() {
        System.out.println("This is a final class.");
    }
}

// The following would cause an error: Cannot inherit from final 'inheritance.FinalParent'
// class FinalChild extends FinalParent { }

public class FinalExample {
    public static void main(String[] args) {
        FinalParent p = new FinalParent();
        p.show();
    }
}
