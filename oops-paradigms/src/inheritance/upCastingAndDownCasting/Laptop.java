package inheritance.upCastingAndDownCasting;

public class Laptop extends Machine{
    public void doProgramming(){
        System.out.println(this.getClass().getName() + " I'm trying to learn programming");
    }

    public void design(){
        System.out.println("Design something on laptop");
    }
}
