package replace_conditional_with_polymorphism;

abstract class Employee {

    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANGER = 3;

    abstract int getTypeCode();

    public int payAmount(EmployeeSalary employeeSalary) {
        switch (employeeSalary.getEmployee()) {
            case Employee.ENGINEER:
                return employeeSalary.getMonthlySalary();
            case Employee.SALESMAN:
                return employeeSalary.getMonthlySalary() + employeeSalary.getCommission();
            case Employee.MANGER:
                return employeeSalary.getMonthlySalary() + employeeSalary.getBonus();
            default:
                throw new RuntimeException("Incorrect employee");
        }
    }
}
