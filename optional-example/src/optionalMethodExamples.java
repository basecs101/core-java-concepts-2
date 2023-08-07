import java.util.Optional;

public class optionalMethodExamples {
    public static void main(String[] args) throws Exception {
        String name = "ViKrAm";

        Optional<String> stringOptional = Optional.ofNullable(name);

        System.out.println("Is value present in Optional : " + stringOptional.isPresent());
//        System.out.println("get the value from Optional : "+stringOptional.get());
//        System.out.println("length of object contained inside Optional : " + stringOptional.get().length());

        stringOptional.ifPresentOrElse(s -> System.out.println("Value present inside Optional is "+s),
                ()-> System.out.println("No value is present"));

        stringOptional.map(s -> {
            System.out.println("S is : "+s);
            Character firstChar = s.charAt(0);
            return firstChar;
        }).ifPresentOrElse(c -> System.out.println("Value present inside Optional is "+c),
                ()-> System.out.println("No value is present"));

        stringOptional.filter(s -> s.length() > 10).ifPresentOrElse(s -> {
            int length = s.length();
            System.out.println(length);
        }, () -> System.out.println("Empty optional is returned by filter after condition checking"));

        //If a value is present, returns the value,
        // otherwise throws an exception produced by the exception supplying function.
        System.out.println("String from optional: "+stringOptional.orElseThrow(() -> {
            System.out.println("Exception occurred due to no value inside optional");
            return new Exception("Exception occurred");
        }));


    }
}
