package inheritance.upCastingAndDownCasting;
/*
Class is blueprint for objects, for a single we can create n of objects.
 */
public class Machine {
    Machine(){
        System.out.println("");
    }
    void startUp(){

        System.out.println(this.getClass().getName() + " Machine is starting up.");
    }

    void shutDown(){
        System.out.println(this.getClass().getName() + " Machine is shutting down.");
    }
}
