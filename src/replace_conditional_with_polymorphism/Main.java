package replace_conditional_with_polymorphism;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        EmployeeSalary employeeSalary1 = new EmployeeSalary(1000000, 200000, 50000, engineer);
        System.out.println("employeeSalary1.payAmount() = " + employeeSalary1.payAmount());

        Salesman salesman = new Salesman();
        EmployeeSalary employeeSalary2 = new EmployeeSalary(1000000, 200000, 50000, salesman);
        System.out.println("employeeSalary2.payAmount() = " + employeeSalary2.payAmount());

        Manager manager = new Manager();
        EmployeeSalary employeeSalary3 = new EmployeeSalary(1000000, 200000, 50000, manager);
        System.out.println("employeeSalary3.payAmount() = " + employeeSalary3.payAmount());
    }
}
