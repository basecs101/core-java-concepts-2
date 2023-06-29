package readwrite;

import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteExample {
    public static void main(String[] args) {
        System.out.println("Hello please enter an input string : ");//write
        Scanner scanner = new Scanner(System.in);//scanner for scanning console

        String input = scanner.nextLine();//read line
        System.out.println(input);//write
        scanner.close();
    }
}
