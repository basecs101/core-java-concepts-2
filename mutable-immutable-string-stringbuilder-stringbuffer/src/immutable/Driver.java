package immutable;

public class Driver {
    public static void main(String[] args) {

        Address address = new Address(101,"Park Street","Pune",411028);

        Employee employee = new Employee(100100,120000,"Vikram",address);

        System.out.println(employee);
        address.setLineNum(200);
        System.out.println(employee);
        employee.getAddress().setLineNum(300);
        System.out.println(employee);
    }
}
