package visitor;

public class Clerk implements Staff {
    private String name;
    private String dept;
    private double salary;
    private int yearsOfExperience;

    public Clerk(String name, String dept, int yearsOfExperience, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
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

    @Override
    public void Accept(IVisitor visitor) {
        visitor.increaseSalary(this);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    @Override
    public void Accept2(SVisitor visit) {
        visit.presentEmployees(this);
    }
}
