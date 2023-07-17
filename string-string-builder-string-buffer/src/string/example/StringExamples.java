package string.example;
//String is non-primitive data type and creates new string objects which immutable.

/*
There are two ways to create String objects.
1. Using new keyword. -> It creates two object. One in heap and one in string constant pool
if string constant pool doesn't contain same string object.
        String name = new String("Vikram");


2. Using string literal.
        String name2 = "Vivek";//"Vivek" is string literal
 */

/*
String constant pool - It is part of heap memory that is created by String class when
this String class is loaded by the classloader, then a part heap memory is reserved for
string constants and stored into it.
 */
public class StringExamples {
    public static void main(String[] args) {

        String name = new String("Vikram");//this creates new object in SCP and heap both.
        System.out.println(name);

        String name2 = "Vivek";//this creates new object in SCP.
        System.out.println(name2);

        name = name.concat("Gupta");///this creates new object in SCP and heap both.
        System.out.println(name);

        String moin = new String("Moin");
        //moin variable
        //"Moin" two string objects are created, one in heap and other SCP
        //moin variable points object in heap

        moin = moin.concat("Mulani");
        //a new String object will be created, Heap and SCP, "MoinMulani" and
        //moin will point to this new string object in the heap

        String moin2 = "MoinMulani";//moin2 points to SCP object
        System.out.println("moin == moin2 : " + (moin == moin2));

        String moin4 = "Moin";

//        String moin3 = moin4 + "Mulani";//moin3 points to SCP object
        String moin3 = "Moin" + "Mulani";//moin3 points to SCP object
        System.out.println("moin2 == moin3 : " + (moin2 == moin3));
    }
}
