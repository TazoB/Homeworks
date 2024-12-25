package Exercise4;

public class NotFixedSalaryEmployee extends Employee{
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int workDays;
    private double wagePerDay;

    public NotFixedSalaryEmployee(String lastName, String firstName, int phoneNumber, int workDays, double wagePerDay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.workDays = workDays;
        this.wagePerDay = wagePerDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getWagePerDay() {
        return wagePerDay;
    }

    public void setWagePerDay(double wagePerDay) {
        this.wagePerDay = wagePerDay;
    }

    @Override
    public double SalaryCalculator() {
        return workDays * wagePerDay;
    }
}
