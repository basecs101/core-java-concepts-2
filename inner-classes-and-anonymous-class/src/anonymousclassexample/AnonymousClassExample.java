package anonymousclassexample;

public class AnonymousClassExample {

    //Creating an anonymous class that doen't have a name but implements an interface.
    //The object is also created while defining the anonymous class.
    //This runnable is just another field of class AnonymousClassExample
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Run method called.");
        }
    };

    /*
    {
        @Override
        public void run() {
            System.out.println("Run method called.");
        }
    }; this { }; is called anonymous class which is implementing Runnable interface
     */


    public static void main(String[] args) {
        //to access run method we need runnable and to access runnable we need
        //AnonymousClassExample's object
        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();
        anonymousClassExample.runnable.run();
    }

}

class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Run method called.");
    }
}
