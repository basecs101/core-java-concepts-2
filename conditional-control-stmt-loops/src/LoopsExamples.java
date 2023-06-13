public class LoopsExamples {
    public static void main(String[] args) {
        //print first 10 natural numbers
        //Loops - use for repetitive operation
        //1. For
        //2. while
        //3. do while
        //4. advanced for loop
        System.out.println("For Loop example:");
        for (int i=1; i<=10; i++){
            //int i=1; -> initialization  i<=10; -> cond check i++ -> increment/dec

            System.out.println("i = " + i);

        }
        System.out.println("For Loop example:");
        for (int i=10; i>=1; i--){
            //int i=1; -> initialization  i<=10; -> cond check i++ -> increment/dec

            System.out.println("i = " + i);

        }

        System.out.println("While Loop example:");
        int i=0;//init
        while (i>=1 /*condition checking*/){
            System.out.println("i = " + i);
            i--;//dec or inc
        }

        System.out.println("Do-While Loop example:");
        int j=0;//init
        do {
            System.out.println("j = " + j);
            j--;//dec or inc
        }while (j>=1 /*condition checking*/);

    }
}
