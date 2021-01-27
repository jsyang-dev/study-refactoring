package replace_conditional_with_polymorphism;

abstract class Employee {

    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANGER = 3;

    abstract int getTypeCode();

    abstract int payAmount(EmployeeSalary employeeSalary);
}
