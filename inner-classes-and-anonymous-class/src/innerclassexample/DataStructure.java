package innerclassexample;


//Outer class
// can only have 2 access levels, one is public and other is default.
public class DataStructure {

    private Integer num = 10;

    //Inner class is just another field of outer class object
    //It can have all access level, eg. private, default, protected, package.
    //Inner class has access to outer class fields even if inner class is declared as private.
    private class Printer {
        void display(){
            System.out.println(num);
            for (int i = 0; i < num; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    void showMsg(){
        System.out.println("A msg from outer class");
    }

    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();//first create outer class object
        dataStructure.showMsg();
        Printer printer = dataStructure.new Printer();//then use outer class object to create
        //inner class object
        printer.display();

        dataStructure.new Printer().display();
    }
}
