package encapsulation;

import java.util.Random;

//Class is representation of objects-
//Each object has properties/field and behaviour/method
//fields -> private
//for each field has public getter and setter
//Now class is like protected shield.
//The object's fields are not directly accessible to other classes of same package or outside package.
public class Employee {

    private String name;
    private String company;
    private int age;
    private int id;
    private int salary;

    public Employee(String name, String company, int age, int id, int salary) {
        this.name = name;
        this.company = company;
        this.age = age;
        this.id = id;

        if (salary > 10000)
            this.salary = salary;
        else
            this.salary = 10000;
    }

    public Employee(String name, String company, int age, int id) {
        this.name = name;
        this.company = company;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 10000)
            this.salary = salary;
        else
            this.salary = 10000;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
