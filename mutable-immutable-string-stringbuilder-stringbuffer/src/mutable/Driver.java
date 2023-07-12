package mutable;

public class Driver {
    public static void main(String[] args) {

        Address address = new Address(101,"Park Street","Pune",411028);

        Employee employee = new Employee(100,120000,"Vikram",address);

//        System.out.println(employee.toString());
        System.out.println(employee);
        employee.id = 200;//employee object's id has changed, hence employee object is mutable
        System.out.println(employee);
    }
}
