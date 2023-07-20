/*
Error - an error in the program is an abnormal condition that can not be handled or recovered.
Error's parent class is Throwable.

Some Error subclasses are :-
    1. MemoryOutOfError
    2. StackOverflowError
    3. JavaVirtualMachineError
 */
public class ErrorExample {
    public static void main(String[] args) {
        sayHello();
    }
    static void sayHello() {
        System.out.println("Hello infinite times");
        sayHello();
    }
}
