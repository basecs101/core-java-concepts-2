import java.util.Optional;

/*
What is Optional class in java?
A container object which may or may not contain a non-null value.
If a value is present, isPresent() returns true.
If no value is present, the object is considered empty and isPresent() returns false.
Additional methods that depend on the presence or absence of a contained value are provided,
such as orElse() (returns a default value if no value is present) and
ifPresent() (performs an action if a value is present).
 */

public class OptionalExample {
    public static void main(String[] args) {
        String name = "Vikram";

        if (name != null && !name.isEmpty() && name.length() > 4){
            System.out.println("Name is not null and not empty and length is greater than 4");
        } else {
            System.out.println("Either name is null or name is empty or length is smaller than or equal to 4");
        }


        /*
        To create an Optional object on given object there are 3 methods
        1. of -> Use when object is not null otherwise it will throw an NPE
        2. ofNullable -> Use when object may be null. this method returns Optional object with the value provided
        if object is null it will return Optional with no value inside it.
        3. empty -> returns an Optional with no value inside it
         */

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional is created with empty object inside it - "+ emptyOptional.isPresent());
        System.out.println("Empty Optional is created with empty object inside it - "+ emptyOptional.isEmpty());

        String nullObject = null;
        Optional<String> optionalString = Optional.ofNullable(nullObject);
        //With the help of Optional, null checks can be removed from program.
        if (optionalString.isPresent() && optionalString.get().length() > 4){
            System.out.println("Using Optional - Name is not null and not empty and length is greater than 4");
        } else {
            System.out.println("Using Optional - Either name is null or name is empty or length is smaller than or equal to 4");
        }

        Optional<String> optionalString2 = Optional.of("Vikram");
        //With the help of Optional, null checks can be removed from program.
        if (optionalString2.isPresent() && optionalString2.get().length() > 4){
            System.out.println("Using Optional - Name is not null and not empty and length is greater than 4");
        } else {
            System.out.println("Using Optional - Either name is null or name is empty or length is smaller than or equal to 4");
        }





    }
}

