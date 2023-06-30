package inheritance.upCastingAndDownCasting;

public class Driver {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startUp();
        machine.shutDown();


        Laptop laptop = new Laptop();
        laptop.startUp();
        laptop.doProgramming();
        laptop.shutDown();

        Printer printer = new Printer();
        printer.startUp();
        printer.print();
        printer.shutDown();


        /*
        In upcasting you create an object of child class
        and assign it to parent class reference variable
        Parent reference
            ^
            |
            |
        Child object
        Every laptop will be a machine.
         */

        //Upcasting is creating the object of child class and assigning it to the parent class reference

        Machine laptop1 = new Laptop();//upcasting //startUp, shutDown and doProgramming
        laptop1.startUp();
        laptop1.shutDown();

        Machine printer1 = new Printer();//upcasting
        printer1.startUp();
        printer1.shutDown();


        /*
        In down casting you create an object of parent class
        and assign it to child class reference variable
        Parent object
            |
            |
        Child reference
        Will every Machine be a Laptop?
         */

        //In down casting, we create object of parent class and assign it to the reference of child class
        Laptop laptop2 = (Laptop) new Machine();//startUp() and shutDown()
        //laptop2 is of type Laptop - that means laptop2 has 3 methods but
        //laptop2 is pointing to Machine object's methods and there are only 2 methods.
        //hence we cannot access 3rd method of laptop2.
        //hence we can do compile time casting but it will throw runtime class cast exception
        laptop2.startUp();
//        laptop2.doProgramming();
        laptop2.shutDown();
    }
}
