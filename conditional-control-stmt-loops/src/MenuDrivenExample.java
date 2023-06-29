import java.util.Scanner;

public class MenuDrivenExample {
    /*
    Write a program using loop and switch using menu.
     */
    public static void main(String[] args) {

        String yesNo = "yes";//init
        while (yesNo.equalsIgnoreCase("yes")){
            Scanner scanner = new Scanner(System.in);
            //Read some strings or user input from console
            //read-write - input and output
            System.out.println("Please enter an input(day of week): ");//output
            String dayOfWeek = scanner.next();//input


            switch (dayOfWeek) {
                case "Monday" -> System.out.println("Mondays are boring.");
                case "Tuesday" -> System.out.println("Tuesday Better than Monday.");
                case "Wednesday" -> System.out.println("Wednesday is Okays.");
                case "Thursday" -> System.out.println("Thursday is day that I go to office.");
                case "Friday" -> System.out.println("Summer Fridays are half days");
                case "Saturday" -> System.out.println("First day weekend");
                case "Sunday" -> System.out.println("Awesome day.");
                default -> System.out.println("User has entered invalid input");
            }

            System.out.println("Do you want to continue : \n1. Yes\n2. No");
            yesNo = scanner.next();
        }

    }
}
