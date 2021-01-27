package replace_conditional_with_polymorphism;

public class Manager extends Employee {

    @Override
    int getTypeCode() {
        return Employee.MANGER;
    }

    @Override
    public int payAmount(EmployeeSalary employeeSalary) {
        return employeeSalary.getMonthlySalary() + employeeSalary.getBonus();
    }
}
