package functional.interface1;

class Test implements ExampleInterface{
    @Override
    public int randomCalculate(int a, int b) {
        return 0;
    }

    @Override
    public void print(int result) {
        ExampleInterface.super.print(result);
    }

//    @Override
//    public void print2() {
//        ExampleInterface.super.print2();
//    }
}
public class Driver {
    public static void main(String[] args) {

        ExampleInterface test = new Test();
        test.randomCalculate(100,200);
        test.print2();
        test.print(100);


        ExampleInterface instanceUsingAnonymousClass = new ExampleInterface() {
            @Override
            public int randomCalculate(int a, int b) {
                System.out.println("randomCalculate() method called inside anonymous class!!!");
                return 0;
            }
            @Override
            public void print(int result) {
                ExampleInterface.super.print(result);
            }

            @Override
            public void print2() {
                ExampleInterface.super.print2();
            }
        };
        instanceUsingAnonymousClass.print(100);
        instanceUsingAnonymousClass.print2();
        instanceUsingAnonymousClass.randomCalculate(10,20);


        ExampleInterface instanceUsingLambdaExp = (a, b) -> {
            System.out.println("Lambda called");
            return a*b;
        };

        /*
        (a, b) -> {
            System.out.println("randomCalculate() method called inside lambda exp!!!");
            return 0;
        }; this is a lambda expression which is nothing but definition for abstract method
        of functional interface.
        This lambda expression automatically creates an object of interface and returns it.
        Which is very similar to anonymous class.
         */

        instanceUsingLambdaExp.print(200);
        System.out.println("Return value : " + instanceUsingLambdaExp.randomCalculate(10,20));


    }
}
