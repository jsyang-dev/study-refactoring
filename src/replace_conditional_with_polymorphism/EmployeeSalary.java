package replace_conditional_with_polymorphism;

public class EmployeeSalary {

    private final int monthlySalary;
    private final int commission;
    private final int bonus;
    private final Employee employee;

    public EmployeeSalary(int monthlySalary, int commission, int bonus, Employee employee) {
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
        this.employee = employee;
    }

    public int payAmount() {
        return extractedPayAmount();
    }

    private int extractedPayAmount() {
        switch (getEmployee()) {
            case Employee.ENGINEER:
                return monthlySalary;
            case Employee.SALESMAN:
                return monthlySalary + commission;
            case Employee.MANGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect employee");
        }
    }

    private int getEmployee() {
        return employee.getTypeCode();
    }
}
