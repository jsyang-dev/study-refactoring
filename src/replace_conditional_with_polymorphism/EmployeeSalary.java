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
        return employee.payAmount(this);
    }

    public int getEmployee() {
        return employee.getTypeCode();
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
