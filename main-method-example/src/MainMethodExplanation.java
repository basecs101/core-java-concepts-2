public class MainMethodExplanation {

    //this count field is not object's property, but it belongs to class.
    static int count;

    /*
       public - public access - this means this method can be accessed from anywhere
       static - means this method is not object's method, basically you can call this method w/o object
       creation. static method are basically class level methods. They are accesses through className
       void - return type - this void means , main method is not returning any value
       main - method name
       () - is required for each method
       String[] args - arguments to main - String is Data type and String[] -> This is string array
        */
    public static void main(String[] args){
        System.out.println("Main method executed");
        MainMethodExplanation.sayHello("Komal");
        System.out.println("main exited");
        System.out.println("Count value is : "+MainMethodExplanation.count);


        /*
        System -> The System class contains several useful class fields and methods.
        It cannot be instantiated. (Object cannot be created).
        Among the facilities provided by the System class are standard input,
        standard output, and error output streams.
        out -> public static final java.io.PrintStream out
        println() -> this is PrintStream object's method

         */
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
        Motor.rotateMotor();
        System.out.println("sayHello exited");
    }
}

class Motor{
    static void rotateMotor(){
        System.out.println("Motor is rotating");
        System.out.println("This motor belongs to ");
        System.out.println("rotateMotor exited");
    }
}
