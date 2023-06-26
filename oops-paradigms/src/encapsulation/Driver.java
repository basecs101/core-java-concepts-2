package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee("Vikram","Integral Ad Science",27,101);
        employee.setSalary(0);
        System.out.println(employee);
        employee.setSalary(220000);
        System.out.println(employee);
    }
}
