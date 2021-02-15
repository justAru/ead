package visitor;

public interface SVisitor {
    void presentEmployees(Employee employees);
    void presentEmployees(Clerk clerk);
}
