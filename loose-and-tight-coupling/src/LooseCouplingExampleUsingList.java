import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LooseCouplingExampleUsingList {
    public static void main(String[] args) {

        //ArrayList<String> guestList = new ArrayList<>();//tight coupling

        LinkedList<String> guestList = new LinkedList<>();//tight coupling
        // trying to change ArrayList to LinkedList for above guestList

        guestList.add("Arti");
        guestList.add("Moin");
        guestList.add("Bhagyashree");
        //guestList.trimToSize();//We have to comment this method call
        //because this method is only written in ArrayList and not in LinkedList
        //this method is written in ArrayList only.
        //if we try to use LinkedList instead of ArrayList object then
        //we will have to remove this calling method "trimToSize()"


//        List<String> newGuestList = new ArrayList<>();//loose coupling
        List<String> newGuestList = new LinkedList<>();
        newGuestList.add("Vikram");
        newGuestList.add("Prathmesh");

    }
}
