package visitor;

public interface IVisitor {
    void increaseSalary(Employee employees);
    void increaseSalary(Clerk clerk);
}
