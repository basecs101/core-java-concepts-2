public class UncheckedExceptionExample {
    public static void main(String[] args) {

        try {
            int numArray[] = {1, 2, 3, 4, 5};//these 5 numbers are stored at indices 0,1,2,3,4

            //trying to access a number at index 10
            System.out.println("Value at index 10 in numArray : " + numArray[10]);
            /*
            above statement will throw ArrayIndexOutOfBounds Exception as array only has 5 elements from 0 to 4 indices.
             */

        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("ArrayIndexOutOfBoundsException occurred : "+arrayIndexOutOfBoundsException);
        }
        System.out.println("Rest of code !!!");
    }
}