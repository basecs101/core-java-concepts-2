package abstraction2;

// Abstraction - hiding implementation details
// e.g. If you have seen circuit board, you know on-off functionality, and you don't bother about
// internal implementation of circuit board.

//Abstract class shows you what functionality you can have in your derived classes.
//Using Abstract class we can achieve 0-100% abstraction(hiding implementation).

//Abstract class can have its own non-abstract methods.
public abstract class Shape {

    abstract void draw();//abstract method, access level is default

    public abstract double calculateArea();//abstract method

    void displayMsg(){
        System.out.println("Shaping is getting drawn.");
    }

}
