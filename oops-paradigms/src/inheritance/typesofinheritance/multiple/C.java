package inheritance.typesofinheritance.multiple;

//Java doesn't support multiple inheritance through extends keyword but it is allowed through interface.

public class C extends A {

    @Override
    void display() {
        super.display();
    }
}
