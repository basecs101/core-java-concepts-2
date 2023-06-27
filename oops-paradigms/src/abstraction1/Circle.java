package abstraction1;

public class Circle implements Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a circle.");
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }
}
