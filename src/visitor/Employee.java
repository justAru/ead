package visitor;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Staff {
    private String name;
    private String dept;
    private int yearsOfExperience;
    private double salary;

    private ArrayList<Staff> controls;

    public Employee(String name, String dept, int yearsOfExperience, int salary) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        controls = new ArrayList<Staff>();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void PrintStructures() {
        System.out.println("\t\t" + this.name + "works in"
                + this.dept + "Experience :"
                + this.yearsOfExperience + "years");
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void Add(Staff e) {
        controls.add(e);
    }

    public ArrayList<Staff> getControls() {
        return controls;
    }

    public void Remove(Staff e){
        controls.remove(e);
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.increaseSalary(this);
    }

    @Override
    public void Accept2(SVisitor visit) {
        visit.presentEmployees(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", controls=" + controls +
                '}';
    }
}
