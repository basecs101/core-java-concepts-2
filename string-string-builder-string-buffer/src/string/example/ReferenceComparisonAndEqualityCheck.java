package string.example;

// == operator is called address or reference comparison
// equals() method compares content two objects.
public class ReferenceComparisonAndEqualityCheck {
    public static void main(String[] args) {

        String s1 = "Mike";//s1 = 1000h
        String s2 = s1;//s2 = 1000h

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Mike");//2 objects, one heap and other in SCP
        //s3 will point to new object in heap, s3=3000h

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));



    }
}
