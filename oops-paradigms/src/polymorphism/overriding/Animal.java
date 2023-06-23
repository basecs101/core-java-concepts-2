package polymorphism.overriding;

public class Animal {
    Animal walk(){
        System.out.println("Animal is walking");
        return new Animal();
    }

    void run(String msg){
        System.out.println("Animal is running "+ msg);
    }
}
