package some.enum1.example;

//ENUM is set predefined constants.
//e.g. Direction is an enum of predefined constants.

//enum is very similar to class.
//enum can have fields, it can also have constructors and methods.
//each enum constants is by default, public static final of type Enum
//each enum constant is written in capital letters.
//enum is basically a class. But only difference is its objects are pre created at the time of
//enum loading

//static variables and static blocks are initialized and executed when class is loaded into memory by classloader.
//the initialization and execution is done by execution engine of JVM.
public enum Direction {

    //set of enum constants. these are basically enum objects.

    //public static final Direction NORTH = new Direction("North is hot") //NORTH object is created
    NORTH("North is hot"),

    //public static final Direction SOUTH = new Direction("South food is Awesome")
    SOUTH("South food is Awesome"),

    //public static final Direction EAST = new Direction("Sun rises in the east direction")
    EAST("Sun rises in the east direction"),

    //public static final Direction WEST = new Direction("West is my home")
    WEST("West is my home");
    //all the four variables are enum objects and they are created when the class will get loaded.
    //because all of them are static.


    //instance variable
    String msg;

    //constructor //this cons automatically made private by java compiler.
    Direction(String msg) {
        this.msg = msg;
        System.out.println("Msg from constructor " + msg);
    }

    //getters and setters for field msg.
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
