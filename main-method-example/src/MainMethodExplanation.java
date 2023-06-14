public class MainMethodExplanation {

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
        sayHello("Komal");
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
        Motor.rotateMotor(name);
    }
}

class Motor{
    public static void rotateMotor(String name){
        System.out.println("Motor is rotating");
        System.out.println("This motor belongs to " + name);
    }
}
