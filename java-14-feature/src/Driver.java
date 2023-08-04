import java.util.Objects;

//Student is a Plain Old Java Object (POJO)
//This Student class contains basic fields and their getters only.
//Also contains basic overridden methods like toString, equals, hashCode.
//This Student fields are final, that means once an object is created their fields(state) cannot changed.
//So basically Student is an immutable class/object

/*
Record is introduced in Java 14 as preview feature and was released in Java 15
Record is an immutable class/object
It reduces the code that we write for Plain Old Java Objects(eg. Student, Employee etc. if they are immutable)

Syntax-
record Student (String name, int age){
}

by default record provides all argument constructor, their getters eg. name() and age().
 */
record Student(String name, int age) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student student)) return false;

        return age == student.age
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age * 10);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Vikram",28);
        System.out.println(student1.name() + " "+student1.age());
        System.out.println(student1.toString());
    }
}

