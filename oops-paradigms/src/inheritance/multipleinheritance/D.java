package inheritance.multipleinheritance;

/*
Example of multiple inheritance where one class extends another and at the same time
implements multiple interfaces.
 */
public class D extends A implements B, C {

    @Override
    void displayA() {
        System.out.println("print D");
        super.displayA();
    }


    @Override
    public void displayB() {
        System.out.println("print B");
    }

    @Override
    public void displayC() {
        System.out.println("print C");
    }
}
