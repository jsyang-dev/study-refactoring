package replace_conditional_with_polymorphism;

public class EmployeeSalary {

    private final int monthlySalary;
    private final int commission;
    private final int bonus;
    private final Employee type;

    public EmployeeSalary(int monthlySalary, int commission, int bonus, Employee type) {
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
        this.type = type;
    }

    public int payAmount() {
        switch (getType()) {
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

    private int getType() {
        return type.getTypeCode();
    }
}
