package replace_conditional_with_polymorphism;

public class Engineer extends Employee {

    @Override
    int getTypeCode() {
        return Employee.ENGINEER;
    }

    @Override
    public int payAmount(EmployeeSalary employeeSalary) {
        return employeeSalary.getMonthlySalary();
    }
}
