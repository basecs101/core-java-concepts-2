package inheritance.upCastingAndDownCasting;

public class Printer extends Machine{

    /*
      void startUp(){
        System.out.println(this.getClass().getName() + " Machine is starting up.");
    }

    void shutDown(){
        System.out.println(this.getClass().getName() + " Machine is shutting down.");
    }
     */
    public void print(){
        System.out.println(this.getClass().getName() + " Printer is printing document.");
    }
}
