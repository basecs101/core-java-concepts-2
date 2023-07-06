package immutable;

//Employee is representation employee objects.
//How to create Immutable object - rules
/*
1. Don't write Setters for all fields.(make all fields private)
2. Write all arg constructor
3. make class final, this means no other classes can inherit this class. And hence cannot change object's state
4. Use deep clone for mutable fields in constructor.
5. Use deep clone for mutable fields in getters.
 */
public final class Employee {
    private int id;
    private int salary;
    private String name;
    private Address address;

    public Employee(int id, int salary, String name, Address address) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = new Address(address.getLineNum(),address.getStreetName(),address.getCity(),address.getPinCode());
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
        return new Address(address.getLineNum(),address.getStreetName(),address.getCity(),address.getPinCode());
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
