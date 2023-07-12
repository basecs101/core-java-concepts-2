package immutable;

//Employee is representation employee objects.
//How to create Immutable object - rules
//State of object cannot be changed in case of immutable objects/classes.
/*
1. Make all fields private
2. Create all argument constructor
3. Remove All setters
4. Use deep clone for objects in the constructor and getter methods
5. Make class as final
6. Optional rule - make all fields as final
 */
public class Employee {
    private final int id;
    private final int salary;
    private final String name;
    private final Address address;

    public Employee(int id, int salary, String name, Address address) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = new Address(address.getLineNum(),address.getStreetName(),address.getCity()
        ,address.getPinCode());// this.address = 6000h
        //this line creates a new object of Address and hence the receiving param 'address'
        //and field 'address' has different objects' address.

    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
//        return address;//1000h
        return new Address(address.getLineNum(),address.getStreetName(),address.getCity(),address.getPinCode());//2000h
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
