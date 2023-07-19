
//Exception is abnormal behaviour in the program.
//When an exception occurs in the program, and it is not handled properly then
//the lines below the exception do not get executed.

//Exceptions are of two types-
//1. Compile time exception - these exceptions are thrown while compiling the program.
//2. Runtime time exception - these exceptions are thrown when program is executed.

/*
    In exception hierarchy Top level class is Throwable
    Exception class extends Throwable

    compile time exception -> IOException extends Exception
    compile time exception -> ClassNotFoundException extends Exception
    compile time exception -> FileNotFoundException extends Exception

    run time exception -> RuntimeException extends Exception

    ArithmeticException extends RuntimeException
    NullPointerException extends RuntimeException
    IndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException
        //StringIndexOutOfBoundsException
 */

/*
 There are two ways to handle ex exceptions
    1. Using try catch block.
    2. Using throws keyword with method header.
 */
public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        //the statement(s) that cause an exception must be put inside try block and should have a catch block to catch e
        //if an exceptions occurs then associated catch block is called and normal flow of programs gets executed.

        try {
            c=a/b;
        } catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }

        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

