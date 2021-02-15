package Composite;

public interface Department {
    int getWage();
    int getNumOfEmployee();
    void add(Department department);
    void delete(Department department);
}