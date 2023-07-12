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


    }
}
