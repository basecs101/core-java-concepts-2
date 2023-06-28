package abstractionClass;

public class Driver {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(10,20);

        circle.draw();
        System.out.println("Circle area : " + circle.calculateArea());
        circle.displayMsg();
        square.draw();
        System.out.println("Square area : " + square.calculateArea());
        square.displayMsg();
        rectangle.draw();
        System.out.println("Rectangle area : " + rectangle.calculateArea());
        rectangle.displayMsg();

    }
}
