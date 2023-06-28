package abstractionUsingInterface;

public class Triangle implements Shape2{

    float base;
    float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing Triangle");
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    @Override
    public void color() {
        System.out.println("I'm coloring triangle");
    }
}
