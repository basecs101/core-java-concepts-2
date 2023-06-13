public class ArrayExample {
    public static void main(String[] args) {
        //even number array till 10 -> {0,2,4,6,8,10}
        //prime num till 10->{2,3,5,7}// array indexing starts with 0.

        int[] primeNums = new int[] {2,3,5,7};

        for ( int num : primeNums) {
            System.out.println(num);
        }

        String[] fruits = new String[] {"Apple", "Mango", "Orange","Pomegranate","Grapes"};

        for (String nameOfFruit : fruits) {
            System.out.println(nameOfFruit);
        }
    }
}
