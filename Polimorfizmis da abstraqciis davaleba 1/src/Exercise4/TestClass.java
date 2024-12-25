package Exercise4;

public class TestClass {
    public static void main(String[] args) {
        FixedSalaryEmployee employee = new FixedSalaryEmployee("firstName1", "secondName1", 1092379, 999);
        System.out.println(employee.SalaryCalculator());

        NotFixedSalaryEmployee employee1 = new NotFixedSalaryEmployee("firstName2", "lastName2", 923874, 20, 60);
        System.out.println(employee1.SalaryCalculator());
    }
}