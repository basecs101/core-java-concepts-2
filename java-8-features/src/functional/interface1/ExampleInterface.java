package functional.interface1;

//functional interface is an interface that has at most one abstract method -> exhibits only one feature.
//it can have any number static methods
//it can also have any number of default methods
@FunctionalInterface
public interface ExampleInterface {
    int randomCalculate(int a, int b);//method declaration for abstract method

    default void print(int result) {
        System.out.println(result);
    }//default method is a concrete method that written in functional interface.

    default void print2() {
        System.out.println("inside print2 method");
    }

    static void showMsg(String msg) {
        System.out.println(msg);
    }

    static void showMsg2(String msg) {
        System.out.println(msg);

    }
}