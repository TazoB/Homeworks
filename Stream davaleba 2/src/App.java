import java.util.ArrayList;
import java.util.List;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // 2.
        employeeList.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

        // 3.
        List<Employee> joined2023 = employeeList.stream()
                .filter(employee -> employee.getId().startsWith("2023"))
                .toList();
        System.out.println(joined2023);

        // 4.

        employeeList.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
