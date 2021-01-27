package replace_conditional_with_polymorphism;

public class Manager extends Employee {

    @Override
    int getTypeCode() {
        return Employee.MANGER;
    }
}
