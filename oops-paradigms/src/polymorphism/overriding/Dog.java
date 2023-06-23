package polymorphism.overriding;

public class Dog extends Animal{
    @Override
    Dog walk() {
        System.out.println("Dog is walking.");
        return new Dog();
    }

    @Override
    void run(String msg) {
        System.out.println("Dog is running.");
    }
}
