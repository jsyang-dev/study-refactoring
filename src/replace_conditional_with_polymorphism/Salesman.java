package replace_conditional_with_polymorphism;

public class Salesman extends Employee {

    @Override
    int getTypeCode() {
        return Employee.SALESMAN;
    }
}
