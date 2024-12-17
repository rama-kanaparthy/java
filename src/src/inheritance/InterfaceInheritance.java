package inheritance;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Implementing methodA");
    }

    public void methodB() {
        System.out.println("Implementing methodB");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}

