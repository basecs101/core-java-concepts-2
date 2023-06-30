public class AnotherArrayExample {
    public static void main(String[] args) {
        String[] guests = new String[10];//Max elements 10
        //Array indexing starts from 0
        // elements get stored from 0 to 9 -> 10 elements
        guests[0] = "Arti";
        guests[1] = "Bhagyashree";
        guests[2] = "Vikram";
//        guests[3] to guests[8] are null values because of String data type
        guests[9] = "Karan";
//        guests[10] = "Komal"; This will throw Runtime exception, ArrayIndexOutOfBoundsException

        System.out.println("Length/size of array is : " + guests.length);
        for (int i = 0; i < 10; i++) {
            System.out.println("array element at index "+i + " is " + guests[i]);
        }

        for (String name:  guests) {
            System.out.println("array element " + name);
        }
    }
}
