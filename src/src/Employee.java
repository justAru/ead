package src;

public class Employee implements IEmployee {
    private String name;
    private String dept;
    private int yearsOfExperience;
    // конструктор
    public Employee(String name, String dept, int experience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = experience;
    }
    public void PrintStructures() {
        System.out.println("\t\t" + this.name + "works in"
                + this.dept + "Experience :"
                + this.yearsOfExperience + "years");
    }


    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitLeafNode(this);
    }
}
