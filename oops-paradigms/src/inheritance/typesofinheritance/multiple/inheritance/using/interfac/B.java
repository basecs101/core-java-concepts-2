package inheritance.typesofinheritance.multiple.inheritance.using.interfac;

public class B extends A {
    @Override
    void display() {
        super.display();
        System.out.println("display method called from A class");
    }
}
