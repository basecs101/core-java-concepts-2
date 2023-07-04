package abstractionUsingInterface;

// Abstraction - hiding implementation details
// e.g. If you have seen circuit board, you know on-off functionality, and you don't bother about
// internal implementation of circuit board.

//Interface shows you what functionality you can have in your class.
//Using Interface we can achieve full or 100% abstraction(hiding implementation)
//abstraction is also called implementation hiding
public interface Shape {

    void draw();//abstract method, these methods are by default public and abstract

    double calculateArea();//abstract method

}
