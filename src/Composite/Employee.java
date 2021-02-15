package Composite;

public class Employee implements Department {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getWage() {
        return salary;
    }

    @Override
    public int getNumOfEmployee() {
        return 1;
    }

    @Override
    public void add(Department department) {

    }

    @Override
    public void delete(Department department) {
    }
}
