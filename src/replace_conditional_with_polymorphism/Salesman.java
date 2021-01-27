package replace_conditional_with_polymorphism;

public class Salesman extends Employee {

    @Override
    int getTypeCode() {
        return Employee.SALESMAN;
    }

    @Override
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
