package src;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee{
    private String name;
    private String dept;

    private int yearsOfExperience;
    //контейнер для объектов Employee
    private ArrayList<IEmployee> controls;
    // конструктор
    public CompositeEmployee(String name, String dept, int experience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = experience;
        controls = new ArrayList<IEmployee>();
    }
    public void Add(IEmployee e) {
        controls.add(e);
    }

    public void Remove(IEmployee e) {
        controls.remove(e);
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

    public ArrayList<IEmployee> getControls() {
        return controls;
    }

    public void PrintStructures() {

        System.out.println("\t" + this.name + "works in" +
                this.dept  + "Experience :" +
                this.yearsOfExperience + "years");
        for (IEmployee e:controls
             ) {
            e.PrintStructures();

        }
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitCompositeElement(this);
    }
}
