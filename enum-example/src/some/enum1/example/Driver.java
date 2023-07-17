package some.enum1.example;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Direction.values() : "+ Arrays.toString(Direction.values()));

        for (Direction direction : Direction.values()) {
            System.out.println(direction.msg);
        }
        System.out.println(Direction.NORTH.msg);

    }
}
