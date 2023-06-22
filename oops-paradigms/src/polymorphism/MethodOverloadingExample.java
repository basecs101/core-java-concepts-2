package polymorphism;
/*
    Many form of same item/thing
    Single method can have many forms. -> Poly morphism
    1. Static polymorphism or compile-time polymorphism or method overloading
        a - No of parameter can be different
        b - Seq of parameter can be different
        c - Type of parameter can be different
        note - they can have any access level and return type but just having diff access level or return
        type doesn't mean methods are overloaded.
    2. Dynamic polymorphism or runtime polymorphism or method overriding
 */
public class MethodOverloadingExample {

    void displayMsg(){
        System.out.println("A method with no argument called.");
    }

    private void displayMsg(String msg){
        System.out.println("A method with one param called with msg "+ msg);
    }

    public String displayMsg(int num){
        System.out.println("A method with one param called with num "+ num);
        return "Hello World";
    }

    protected int displayMsg(int num, String msg){
        System.out.println("A method with one param called with num "+ num + " msg "+msg);
        return 0;
    }

    void displayMsg(String msg, int num){
        System.out.println("A method with one param called with msg "+ msg + " num "+num);
    }


    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.displayMsg();
    }
}
